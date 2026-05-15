/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe1.br.edu.fatecfranca;

import exe1.br.edu.fatecfranca.Assistente;
import exe1.br.edu.fatecfranca.Funcionario;
import exe1.br.edu.fatecfranca.Gerente;
import exe1.br.edu.fatecfranca.Vendedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class Teste {

    public static void main(String[] args) {
        final double salarioBase = 1000;
        ArrayList<Funcionario> lista = new ArrayList<>();
        lista.add(new Assistente("Roderval", "63", salarioBase));
        lista.add(new Gerente("Tim Maia", "913", salarioBase));
        lista.add(new Vendedor("Ichigo", "563", salarioBase, 500));

        double salarioFuncionarios = lista.stream().mapToDouble((x) -> x.calculaSalario()).sum();
        JOptionPane.showMessageDialog(null, salarioFuncionarios);
        
        /**
         * Foi utilizado heranças, e para a soma dos salarios a expressão lambda.
         */

    }

}
