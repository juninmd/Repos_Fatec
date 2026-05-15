/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2.br.edu.fatecfranca;

/**
 *
 * @author jr_ac
 */
public class Disciplina {

    private int nroCreditos;
    private String nome;
    private String tipo;

    public Disciplina(int nroCreditos, String nome, String tipo) {
        this.nroCreditos = nroCreditos;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Disciplina() {
        this.nroCreditos = 0;
        this.nome = "";
        this.tipo = "";
    }

    public int getNroCreditos() {
        return nroCreditos;
    }

    public void setNroCreditos(int nroCreditos) {
        this.nroCreditos = nroCreditos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String emiteDisciplina() {
        return "Número de Créditos: " + this.nroCreditos
                + "\nNome: " + this.nome
                + "\nTipo: " + this.tipo;

    }
}
