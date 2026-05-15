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
public class Passageiro {

    private String nome;
    private int poltrona;
    private String cpf;
    
    public Passageiro(String nome, int poltrona, String cpf) {
        this.nome = nome;
        this.poltrona = poltrona;
        this.cpf = cpf;
    }

    public Passageiro() {
        this.nome = "";
        this.poltrona = 0;
        this.cpf = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String mostra() {
        return "Passageiro:\nNome: " + this.nome;
    }
}
