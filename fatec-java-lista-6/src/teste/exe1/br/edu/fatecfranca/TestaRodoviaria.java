/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe1.br.edu.fatecfranca;

import exe1.br.edu.fatecfranca.Onibus;
import exe1.br.edu.fatecfranca.Passageiro;
import exe1.br.edu.fatecfranca.Rodoviaria;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class TestaRodoviaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Passageiro passageiro = new Passageiro("Fulano", 2, "ñsei");
        JOptionPane.showMessageDialog(null, passageiro.emitePassageiro());

        Onibus onibus = new Onibus(3);
        onibus.obterOnibus();
        onibus.criaPassageiroClasseStandard();
        onibus.criaPassageiroClasseLuxo();
        JOptionPane.showMessageDialog(null, onibus.emitePassageiros());

        Rodoviaria rodoviaria = new Rodoviaria(80, "Airbus", "Franca");
        rodoviaria.criaOnibus();
        rodoviaria.criaOnibus();
        rodoviaria.criaOnibus();
        rodoviaria.criaOnibus();
       
        rodoviaria.obterOnibus(8);
        JOptionPane.showMessageDialog(null, rodoviaria.emiteOnibus());
        rodoviaria.criaPassageiroClasseStandardOnibus(1);
        rodoviaria.criaPassageiroClasseLuxoOnibus(2);

    }
}
