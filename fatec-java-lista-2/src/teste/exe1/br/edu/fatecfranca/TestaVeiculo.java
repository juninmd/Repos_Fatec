/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe1.br.edu.fatecfranca;

import exe1.br.edu.fatecfranca.Veiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class TestaVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Veiculo.nomeDono = "Pedro";
        
        Veiculo carro = new Veiculo(){{
            Tipo = "carro";
            ano = 2012;
            cor = "preto";
            nroRodas = 4;
        }};
        
          Veiculo moto = new Veiculo(){{
            Tipo = "moto";
            ano = 2012;
            cor = "preto";
            nroRodas = 2;
        }};
          
        JOptionPane.showMessageDialog(null,carro.mostra());
        JOptionPane.showMessageDialog(null,moto.mostra());
        
        moto.Tipo = "Triciclo";
        moto.ano = 2014;
        moto.cor = "azul";
        moto.nroRodas = 3;
        
        Veiculo.alteraNome("Jonas");
        
        JOptionPane.showMessageDialog(null,carro.mostra());
        JOptionPane.showMessageDialog(null,moto.mostra());
        
        if(Veiculo.nroRodas(4)){
            JOptionPane.showMessageDialog(null, "Número de rodas par");
        }
        
        Veiculo novoVeiculo = Veiculo.retornaNovoVeiculo(carro, moto);
        JOptionPane.showMessageDialog(null,novoVeiculo.mostra());
    }
    
}
