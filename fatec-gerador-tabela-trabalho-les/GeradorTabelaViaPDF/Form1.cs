using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using iTextSharp.text.pdf;
using iTextSharp.text.pdf.parser;

namespace GeradorTabelaViaPDF
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnSelecionar_Click(object sender, EventArgs e)
        {
            var x = folderBrowserDialog1.ShowDialog();
            if (x == DialogResult.OK && !String.IsNullOrEmpty(folderBrowserDialog1.SelectedPath))
            {
                textBox1.Text = folderBrowserDialog1.SelectedPath;
            }
        }

        private void btnMagica_Click(object sender, EventArgs e)
        {
            if (String.IsNullOrEmpty(textBox1.Text) || !Directory.Exists(textBox1.Text))
            {
                MessageBox.Show("Selecione um caminho válido para os pdfs");
                return;
            }
            btnMagica.Enabled = false;
            var arquivos = Directory.GetFiles(textBox1.Text, "*.pdf");
            foreach (var arquivo in arquivos)
            {
                var texto = CriarArquivo(arquivo).ToString();
                if (texto.Length == 0)
                    continue;
                var nomeArquivo = arquivo.Replace(".pdf", ".sql");
                File.WriteAllText($"{nomeArquivo}", texto);
            }
            btnMagica.Enabled = true;

            MessageBox.Show("Processamento concluído");
        }

        public StringBuilder CriarArquivo(string pdf)
        {
            var tabelas = LerPadrao(pdf);
            var arquivo = new StringBuilder();

            foreach (var tabela in tabelas)
            {
                arquivo.Append(MontaCreateTable(tabela));
                arquivo.Append(Environment.NewLine);
            }
            return arquivo;
        }

        public StringBuilder MontaCreateTable(Tabela tabela)
        {
            var t = new StringBuilder();
            t.Append($"CREATE TABLE {tabela.Nome} ( {Environment.NewLine}");
            var c = tabela.Atributos.Count;
            for (var i = 0; i < c - 1; i++)
            {
                t.Append($"{tabela.Atributos[i]},{Environment.NewLine}");
            }
            t.Append($"{tabela.Atributos[c - 1]}){Environment.NewLine}");
            return t;
        }

        public static List<Tabela> LerPadrao(string arquivo)
        {
            var linhas = PdfText(arquivo);

            var tabelas = new List<Tabela>();

            var tabela = new Tabela();
            foreach (var linha in linhas)
            {
                if (linha.Contains("Tabela:"))
                {
                    // Caso já exista alguma tabela, adiciona no array 
                    if (tabela.Nome != null)
                    {
                        tabelas.Add(tabela);
                        tabela = new Tabela();
                    }
                    tabela.Nome = linha.Split(':')[1].Split('(')[0].Trim().ToUpper();
                    continue;
                }
                if (tabela.Nome != null && linha.Contains("•") &&
                    (linha.Contains("INTEGER") || linha.Contains("VARCHAR") || linha.Contains("NUMERIC") || linha.Contains("DATE")))
                {
                    var att = linha.Split('•')[1].Split('/')[0].Trim().ToUpper();

                    if (linha.Contains("VARCHAR") && !att.Contains("CHARACTER SET WIN1252"))
                    {
                        var indice = att.Split(')')[0].Length + 1;
                        att = att?.Insert(indice, " CHARACTER SET WIN1252");
                    }
                    tabela.Atributos.Add(att);
                }
            }

            if (tabela.Nome != null && tabelas.FirstOrDefault(q => q.Nome == tabela.Nome) == null)
            {
                tabelas.Add(tabela);
            }
            return tabelas;
        }



        public class Tabela
        {
            public Tabela()
            {
                Atributos = new List<string>();
            }
            public string Nome { get; set; }
            public List<string> Atributos { get; set; }
        }
        public static string[] PdfText(string path)
        {
            var reader = new PdfReader(path);
            string text = string.Empty;
            for (int page = 1; page <= reader.NumberOfPages; page++)
            {
                text += PdfTextExtractor.GetTextFromPage(reader, page);
            }
            reader.Close();
            return text.Split('\n');
        }
    }
}
