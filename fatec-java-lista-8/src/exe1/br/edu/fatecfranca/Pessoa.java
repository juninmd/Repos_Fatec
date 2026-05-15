/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1.br.edu.fatecfranca;

import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor {

    @Override
    public void PagaIR() {
        JOptionPane.showMessageDialog(null, "Pagando IR");
    }

    @Override
    public void GetCPF() {
        JOptionPane.showMessageDialog(null, "Meu cf é 434.123.124-10");
    }

    @Override
    public void Ensina() {
        JOptionPane.showMessageDialog(null, "Ensinando");
    }

    @Override
    public void Trabalha() {
        JOptionPane.showMessageDialog(null, "Trabalhando");
    }

    @Override
    public void Vota() {
        JOptionPane.showMessageDialog(null, "Votando");
    }

    @Override
    public void GetRg() {
        JOptionPane.showMessageDialog(null, "RG : 11.111.111-1");
    }
}
