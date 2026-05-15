/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe2.br.edu.fatecfranca;

import exe2.br.edu.fatecfranca.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente() {
            {
                nome = "Fulano";
                numeroAgencia = "123";
                numeroConta = "333444";
                saldo = 10;
            }
        };
        cliente.realizarDeposito(20f);
        if (!cliente.realizarSaque(3f)) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar esse saque");
        }

        JOptionPane.showMessageDialog(null, cliente.mostra());

        Cliente clienteb = new Cliente() {
            {
                nome = "Beltrano";
                numeroAgencia = "123";
                numeroConta = "689648";
            }
        };
        clienteb.realizarDeposito(50f);
        
        JOptionPane.showMessageDialog(null, "Cliente "+clienteb.nome + 
                " Depositou 50 R$ e cliente "+cliente.nome +
                " sofeu uma alteração em seu saldo" );

        JOptionPane.showMessageDialog(null, cliente.mostra());

                
        if (!clienteb.realizarSaque(500f)) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente "+Cliente.saldo+" para realizar esse saque de "+500f);
        }

        JOptionPane.showMessageDialog(null, clienteb.mostra());

        Cliente novoCliente = Cliente.retornaNovoCliente(cliente, clienteb);

        JOptionPane.showMessageDialog(null, novoCliente.mostra());

        if (Cliente.verificaTamanho(novoCliente.numeroAgencia)) {
            JOptionPane.showMessageDialog(null, "Essa agência possui 6 caracteres");
        } else {
            JOptionPane.showMessageDialog(null, "Essa agência não possui 6 caracteres");
        }

    }

}
