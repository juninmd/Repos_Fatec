/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1.br.edu.fatecfranca;

/**
 *
 * @author jr_ac
 */
public class Assistente extends Funcionario {

    public Assistente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }

    @Override
    public double calculaSalario() {
        return super.getSalario_base();
    }

}
