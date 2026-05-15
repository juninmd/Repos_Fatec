/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe3.br.edu.fatecfranca;

import exe1.br.edu.fatecfranca.Assistente;
import exe1.br.edu.fatecfranca.Funcionario;
import exe1.br.edu.fatecfranca.Gerente;
import exe1.br.edu.fatecfranca.Vendedor;
import exe3.br.edu.fatec.franca.Aniversario;
import exe3.br.edu.fatec.franca.CartaoWeb;
import exe3.br.edu.fatec.franca.DiaDosNamorados;
import exe3.br.edu.fatec.franca.Natal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<CartaoWeb> lista = new ArrayList<>();
        lista.add(new Aniversario("Roderval"));
        lista.add(new DiaDosNamorados("Tim Maia"));
        lista.add(new Natal("Ichigo"));

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).showMessage();
        }
    }

}
