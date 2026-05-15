/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3.br.edu.fatecfranca;

/**
 *
 * @author jr_ac
 */
public class Topico {

    private String assunto;

    public Topico() {
        this.assunto = "";
    }

    public Topico(String assunto) {
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String mostra() {
        return "Tópico: " + this.getAssunto();
    }

}
