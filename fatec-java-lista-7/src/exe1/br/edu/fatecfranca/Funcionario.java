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
public abstract class Funcionario {

    private String nome;
    private String matricula;
    private double salario_base;

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public double calculaSalario() {
        return (salario_base * 1);
    }

    public Funcionario(String nome, String matricula, double salario_base) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario_base = salario_base;
    }

}
