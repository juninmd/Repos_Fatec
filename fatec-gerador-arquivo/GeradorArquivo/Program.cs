using System;
using System.IO;

namespace FalseBI.ConsoleApp
{
    class Program
    {
        static void Main(string[] args)
        {
            int tecla = 0;
            var caminho = @"c:\\gerador";
            int tamanho = 1;
            int quantidade = 1;

            //Bit / byte / megabyte / gigabyte / terabyte
            var intIipoMedida = 1;

            while (tecla != 9)
            {
                Console.Clear();
                Console.WriteLine("------------------------------------");
                Console.WriteLine("----    Gerador de Arquivos    ----");
                Console.WriteLine("-----------------------------------");
                Console.WriteLine($"1) ({quantidade}) Definir quantidade de arquivo(s)");
                Console.WriteLine($"2) ({tamanho} - {TipoMedida(intIipoMedida)}) Definir tamanho de cada arquivo");
                Console.WriteLine($"3) ('{caminho}') Definir caminho");
                Console.WriteLine($"4) Gerar arquivos");
                Console.WriteLine("\n\n9) Sair");

                int.TryParse(Console.ReadLine(), out tecla);
                Console.Clear();

                switch (tecla)
                {
                    case 1:
                        {
                            int.TryParse(Console.ReadLine(), out quantidade);
                            if (quantidade <= 0)
                            {
                                quantidade = 1;
                                Console.WriteLine("Digite uma quantidade superior a 1");
                                Console.ReadKey();
                            }
                            continue;
                        }
                    case 2:
                        {
                            int.TryParse(Console.ReadLine(), out tamanho);
                            if (tamanho <= 0)
                            {
                                tamanho = 1;
                            }
                            Console.WriteLine("Selecione o tipo da medida");
                            Console.WriteLine("1 - byte");
                            Console.WriteLine("2 - kilobyte");
                            Console.WriteLine("3 - megabyte");
                            Console.WriteLine("4 - gigabyte");
                            Console.WriteLine("5 - terabyte");
                            int.TryParse(Console.ReadLine(), out intIipoMedida);
                            Console.Clear();


                            continue;
                        }
                    case 3:
                        {
                            var e = Console.ReadLine();
                            if (!String.IsNullOrEmpty(e))
                                caminho = e;
                            continue;
                        }
                    case 4:
                        {
                            var x = ConverterNaMedida(tamanho, intIipoMedida);
                            var watch = System.Diagnostics.Stopwatch.StartNew();
                            for (int i = 0; i < quantidade; i++)
                            {
                                GerarArquivos($"{caminho}\\{i}.neto", x);
                            }
                            watch.Stop();
                            Console.WriteLine($"{watch.Elapsed.Hours}hs {watch.Elapsed.Minutes}ms {watch.Elapsed.Seconds}s {watch.Elapsed.Milliseconds}mi");
                            Console.ReadKey();
                            continue;
                        }
                    case 9:
                        {
                            break;
                        }
                    default:
                        {
                            Console.Write("Por favor digite uma opção válida :)");
                            Console.ReadKey();
                            continue;
                        }
                }
            }
        }

        private static string TipoMedida(int medida)
        {
            switch (medida)
            {
                case 1:
                    {
                        return "byte";
                    }
                case 2:
                    {
                        return "kilobyte";
                    }
                case 3:
                    {
                        return "megabyte";
                    }
                case 4:
                    {
                        return "gigabyte";
                    }
                case 5:
                    {
                        return "terabyte";
                    }
                default:
                    {
                        Console.WriteLine("Escolha uma medida válida");
                        int.TryParse(Console.ReadLine(), out medida);
                        return TipoMedida(medida);
                    }
            }
        }

        public static long ConverterNaMedida(int tamanho, int tipo)
        {
            switch (tipo)
            {
                case 1:
                    {
                        return tamanho;
                    }
                case 2:
                    {
                        return tamanho * 1024;
                    }
                case 3:
                    {
                        return long.Parse((tamanho * Math.Pow(1024, 2)).ToString());
                    }
                case 4:
                    {
                        return long.Parse((tamanho * Math.Pow(1024, 3)).ToString());
                    }
                case 5:
                    {
                        return long.Parse((tamanho * Math.Pow(1024, 4)).ToString());
                    }
                default:
                    return tamanho;
            }
        }

        private static void GerarArquivos(string fileName, long length)
        {
            System.IO.Directory.CreateDirectory(System.IO.Path.GetDirectoryName(fileName));
            FileStream fileStream = new FileStream(fileName, FileMode.Create, FileAccess.Write);
            fileStream.SetLength(length);
            fileStream.Close();
        }
    }
}
