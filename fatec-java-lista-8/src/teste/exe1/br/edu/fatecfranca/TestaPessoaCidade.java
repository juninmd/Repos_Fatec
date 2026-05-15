/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe1.br.edu.fatecfranca;

import exe1.br.edu.fatecfranca.Cidade;
import exe1.br.edu.fatecfranca.Empregado;
import exe1.br.edu.fatecfranca.Pessoa;

/**
 *
 * @author jr_ac
 */
public class TestaPessoaCidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();
        Cidade rp = new Cidade();
        rp.contrata(fulano);
        rp.contrata((Empregado) fulano);
        rp.cobraDe(fulano);
        rp.registra(fulano);
        rp.alimenta(fulano);

    }

}
