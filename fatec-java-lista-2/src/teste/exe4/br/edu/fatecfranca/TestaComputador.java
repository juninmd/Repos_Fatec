/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe4.br.edu.fatecfranca;

import exe4.br.edu.fatecfranca.Computador;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class TestaComputador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computador pc = new Computador(){{
           processador = "Pentium 4"; 
        }};
        JOptionPane.showMessageDialog(null,pc.mostra());
        pc.alteraProcessador("Intel core i7");
        JOptionPane.showMessageDialog(null,pc.mostra());
        Computador.alteraRam(512);
        JOptionPane.showMessageDialog(null,pc.mostra());
        Computador.upgrade();       
        Computador.upgrade();
        
        JOptionPane.showMessageDialog(null,pc.mostra());

    }
    
}
