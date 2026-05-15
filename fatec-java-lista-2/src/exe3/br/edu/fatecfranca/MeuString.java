/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3.br.edu.fatecfranca;

import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class MeuString {
    public static void main(String[] args) {
        String str1  = "Meu primeiro string";
        JOptionPane.showMessageDialog(null, str1.length());  
        JOptionPane.showMessageDialog(null, str1.charAt(2));  
        
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
           str2 += String.valueOf(i);
        }
        JOptionPane.showMessageDialog(null,str2);  

    }
            
}
