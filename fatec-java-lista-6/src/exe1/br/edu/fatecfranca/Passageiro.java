/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1.br.edu.fatecfranca;

/**
 *
 * @author jr_ac
 */
public class Passageiro {
    protected String nome;
    protected int poltrona;
    protected String tipo;

    public Passageiro(String nome, int poltrona, String tipo) {
        this.nome = nome;
        this.poltrona = poltrona;
        this.tipo = tipo;
    }

    public Passageiro() {
        this.nome="";
        this.poltrona = 0;
        this.tipo="";
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    public String emitePassageiro(){
        return "Nome do passageiro: " + this.nome +
                "\n Número da poltrona: " + this.poltrona +
                "\n Tipo: " + this.tipo;
    }
}
