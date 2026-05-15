/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe4.br.edu.fatecfranca;

/**
 *
 * @author jr_ac
 */
public class Computador {

    public String processador;
    public static int ram;

    public Computador() {
        this.processador = "";
    }

    public Computador(String processador) {
        this.processador = processador;
    }

    public void alteraProcessador(String processador) {
        this.processador = processador;
    }

    public static void alteraRam(int ram) {
        Computador.ram = ram;
    }

    public static void upgrade() {
        Computador.ram += 256;
    }
    
      public String mostra(){
        return "Processador: "+this.processador + "\n"+
                "Ram: "+Computador.ram+"\n";
    }

}
