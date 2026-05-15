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
public class Voo {

    private String destino;
    private String numero;

    public Voo(String destino, String numero) {
        this.destino = destino;
        this.numero = numero;
    }

    public Voo() {
        this.destino = "";
        this.numero = "";
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String Mostra() {
        return "Voo\nDestino: " + this.destino + "\n"
                + "Número: " + this.numero;
    }
}
