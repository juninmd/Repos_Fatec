/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe2.br.edu.fatecfranca;

import exe2.br.edu.fatecfranca.Onibus;
import exe2.br.edu.fatecfranca.Passageiro;
import exe2.br.edu.fatecfranca.Rodoviaria;
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
        Passageiro passageiro = new Passageiro() {
            {
                setCpf("43498486810");
                setNome("Antonio");
                setPoltrona(1);
            }
        };

        Passageiro passageiro2 = new Passageiro() {
            {
                setCpf("43434343442");
                setNome("Matheus");
                setPoltrona(2);
            }
        };

        Passageiro passageiro3 = new Passageiro() {
            {
                setCpf("43434343442");
                setNome("Vinicius");
                setPoltrona(3);
            }
        };
        Passageiro passageiro4 = new Passageiro() {
            {
                setCpf("43434343442");
                setNome("Kaio");
                setPoltrona(4);
            }
        };

        Onibus onibus = new Onibus() {
            {
                setNumero("1");
                associaPassageiro(passageiro);
                associaPassageiro(passageiro2);
                associaPassageiro(passageiro3);
                associaPassageiro(passageiro4);
                JOptionPane.showMessageDialog(null, mostra());
            }
        };

        if (!onibus.desvinculaPassageiro(passageiro)) {
            JOptionPane.showMessageDialog(null, "Passageiro " + passageiro.getNome() + " não encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Passageiro " + passageiro.getNome() + " removido");
        }

        if (!onibus.obterPassageiro(passageiro)) {
            JOptionPane.showMessageDialog(null, "Passageiro " + passageiro.getNome() + "  não encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Passageiro " + passageiro.getNome() + "  encontrado");
        }

        JOptionPane.showMessageDialog(null, onibus.mostra());

            Passageiro passageirob = new Passageiro() {
            {
                setCpf("43498486810");
                setNome("Pedro");
                setPoltrona(1);
            }
        };

        Passageiro passageirob2 = new Passageiro() {
            {
                setCpf("43434343442");
                setNome("Jonas");
                setPoltrona(2);
            }
        };

        Passageiro passageirob3 = new Passageiro() {
            {
                setCpf("43434343442");
                setNome("Joaquim");
                setPoltrona(3);
            }
        };
        Passageiro passageirob4 = new Passageiro() {
            {
                setCpf("43434343442");
                setNome("Gustavo");
                setPoltrona(4);
            }
        };
        Onibus onibusb = new Onibus() {
            {
                setNumero("2");
                associaPassageiro(passageirob);
                associaPassageiro(passageirob2);
                associaPassageiro(passageirob3);
                associaPassageiro(passageirob4);
                JOptionPane.showMessageDialog(null, mostra());
            }
        };

        Rodoviaria rodoviaria = new Rodoviaria() {
            {
                setNome("São João");
                setCidade("Franca");
                associaOnibus(onibus);
                associaOnibus(onibusb);
                JOptionPane.showMessageDialog(null, mostra());
            }

        };
    }
}
