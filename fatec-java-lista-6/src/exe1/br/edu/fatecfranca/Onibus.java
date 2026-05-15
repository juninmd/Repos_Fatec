/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1.br.edu.fatecfranca;

import java.util.ArrayList;

/**
 *
 * @author jr_ac
 */
public class Onibus {

    private int numero;
    public ArrayList<Passageiro> lista;

    public Onibus(int numero) {
        this.lista = new ArrayList();
        this.numero = numero;
    }

    public Onibus() {
        this.lista = new ArrayList();
        this.numero = 0;
    }

    public int getQtdPassageito() {
        return lista.size();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void criaPassageiroClasseStandard() {
        lista.add(new Standard() {
            {
                this.poltrona = 123;
                this.nome = "Batman";
                this.tipo = "humano";
            }
        });
    }

    public void criaPassageiroClasseLuxo() {
        lista.add(new Luxo() {
            {
                this.poltrona = 456;
                this.nome = "Dean Winchester";
                this.tipo = "caçador";
            }
        });
    }

    public Onibus obterOnibus() {
        return new Onibus();
    }

    public String emitePassageiros() {
        String text = "\nQuantidade de passageiros: " + lista.size()
                + "\nNúmero do ônibus: " + this.numero;
        for (int i = 0; i < lista.size(); i++) {
            text += "\n" + lista.get(i).emitePassageiro();

        }
        return text;
    }
}
