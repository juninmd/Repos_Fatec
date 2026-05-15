/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2.br.edu.fatecfranca;

import java.util.ArrayList;

/**
 *
 * @author jr_ac
 */
public class Rodoviaria {

    private int qtdOnibus;
    private String nome;
    private String cidade;
    private ArrayList<Onibus> onibus;

    public Rodoviaria(ArrayList<Onibus> onibus, String nome, String cidade) {
        this.qtdOnibus = onibus.size();
        this.onibus = onibus;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Rodoviaria() {
        this.qtdOnibus = 0;
        this.nome = "";
        this.cidade = "";
        this.onibus = new ArrayList<>();
    }

    public int getQtdOnibus() {
        return this.qtdOnibus;
    }

    public void setQtdOnibus(int qtdOnibus) {
        this.qtdOnibus = qtdOnibus;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Onibus> getOnibus() {
        return onibus;
    }

    public void setOnibus(ArrayList<Onibus> onibus) {
        this.onibus = onibus;
    }

    //
    // CRUD 
    //mostra -ok
    //criaOnibus -ok
    //removeOnibus -ok
    //consultaOnibus -boolean -ok    
    //consultaOnibus-boolean -ok
    //consultaOnibus-int -ok
    //atualizaOnibus -ok
    //
    public String mostra() {
        String texto = "Cidade: " + this.cidade;
        for (int i = 0; i < this.onibus.size(); i++) {
            texto += "\n" + this.onibus.get(i).mostra();
        }
        return texto;
    }

    public void associaOnibus(Onibus onibus) {
        this.onibus.add(onibus);
    }

    public boolean desvinculaOnibus(Onibus onibus) {
        return this.onibus.remove(onibus);
    }

    public boolean obterOnibus(Onibus onibus) {
        return this.onibus.contains(onibus);
    }

    private int obterPosicaoOnibus(Onibus onibus) {
        return this.onibus.indexOf(onibus);
    }

    public boolean atualizaOnibus(Onibus onibus) {
        int i = obterPosicaoOnibus(onibus);
        if (i >= 0) {
            this.onibus.set(i, onibus);
            return true;
        }
        return false;
    }
}
