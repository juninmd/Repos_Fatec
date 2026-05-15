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
public class Luxo extends Passageiro {
    private String bebidaAlcoolica;

    public Luxo(String bebidaAlcoolica, String nome, int poltrona, String tipo) {
        super(nome, poltrona, tipo);
        this.bebidaAlcoolica = bebidaAlcoolica;
    }

    public Luxo() {
        super();
        this.bebidaAlcoolica = "";
    }
    
    public String getBebidaAlcoolica() {
        return bebidaAlcoolica;
    }

    public void setBebidaAlcoolica(String bebidaAlcoolica) {
        this.bebidaAlcoolica = bebidaAlcoolica;
    } 

    @Override
    public String emitePassageiro(){
        return super.emitePassageiro() + 
                "\nBebida alcoolica: " + this.bebidaAlcoolica;
    }
}
