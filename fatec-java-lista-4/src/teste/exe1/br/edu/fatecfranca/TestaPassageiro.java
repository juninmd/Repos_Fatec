/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe1.br.edu.fatecfranca;

import exe1.br.edu.fatecfranca.Passageiro;
import exe1.br.edu.fatecfranca.Reserva;
import exe1.br.edu.fatecfranca.Voo;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class TestaPassageiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Passageiro passageiro = new Passageiro() {
            {
                setNome("Goku");
                setReserva(new Reserva() {
                    {
                        setCodigo(1);
                        setVoo(new Voo() {
                            {
                                setDestino("Japão");
                                setNumero("1f");
                            }
                        });
                    }
                });
            }
        };
        JOptionPane.showMessageDialog(null, passageiro.Mostra());
        JOptionPane.showMessageDialog(null, passageiro.getReserva().Mostra());
        JOptionPane.showMessageDialog(null, passageiro.getReserva().getVoo().Mostra());

    }

}
