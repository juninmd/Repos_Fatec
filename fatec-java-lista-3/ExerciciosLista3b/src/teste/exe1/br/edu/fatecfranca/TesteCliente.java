/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe1.br.edu.fatecfranca;

import ex1.br.edu.fatecfranca.Cliente;

/**
 *
 * @author jr_ac
 */
public class TesteCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente() {{
                setNome("Fulano");
                setNumeroAgencia("6666-6");
                setNumeroConta("10472-2");
                setSaldo(100f);
            }};
        cliente.realizarDeposito(40f);
        cliente.realizarSaque(30f);
        
         Cliente clienteb = new Cliente() {{
                setNome("23232");
                setNumeroAgencia("23232");
                setNumeroConta("4444");
                setSaldo(100f);
            }};
        clienteb.realizarDeposito(40f);
        clienteb.realizarSaque(30f);
    }
}
