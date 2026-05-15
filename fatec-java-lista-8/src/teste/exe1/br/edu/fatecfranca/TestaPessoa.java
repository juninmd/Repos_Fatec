/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe1.br.edu.fatecfranca;

import exe1.br.edu.fatecfranca.Pessoa;

/**
 *
 * @author jr_ac
 */
public class TestaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa() {
            {
                this.Come();
                this.Ensina();
                this.GetCPF();
                this.Respira();
                this.Trabalha();
                this.GetRg();
                this.Vota();
            }
        };

    }
}
