/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1.br.edu.fatecfranca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class Rodoviaria {

    private int qteOnibus;
    private String nome;
    private String cidade;
    private ArrayList<Onibus> listaOnibus;

    public Rodoviaria(int qteOnibus, String nome, String cidade) {
        this.listaOnibus = new ArrayList();
        this.qteOnibus = qteOnibus;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Rodoviaria() {
        this.listaOnibus = new ArrayList();
        this.qteOnibus = 0;
        this.nome = "";
        this.cidade = "";
    }

    public int getQteOnibus() {
        return qteOnibus;
    }

    public void setQteOnibus(int qteOnibus) {
        this.qteOnibus = qteOnibus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void criaOnibus() {
        listaOnibus.add(new Onibus(24));
    }

    public String emiteOnibus() {
        String text = " Quant. Ônibus: " + listaOnibus.size()
                + "\nNome: " + this.nome
                + "\nCidade: " + this.cidade;
        for (int i = 0; i < listaOnibus.size(); i++) {
            Onibus onibus = listaOnibus.get(i);
            text += onibus.emitePassageiros();

            for (int j = 0; j < onibus.getQtdPassageito(); j++) {
                text += onibus.lista.get(j).emitePassageiro();
            }
        }
        return text;
    }

    public Onibus obterOnibus(int posicao) {
        if (listaOnibus.indexOf(posicao) != -1) {
            return listaOnibus.get(posicao);
        }
        JOptionPane.showMessageDialog(null, "Não encontramos esse busão, criamos um novo pra você!");
        return new Onibus();
    }

    public void criaPassageiroClasseStandardOnibus(int index) {
        if (listaOnibus.indexOf(index) != -1) {
            listaOnibus.get(index).criaPassageiroClasseStandard();
        }
    }

    public void criaPassageiroClasseLuxoOnibus(int index) {
        if (listaOnibus.indexOf(index) != -1) {
            listaOnibus.get(index).criaPassageiroClasseLuxo();

        }
    }
}
