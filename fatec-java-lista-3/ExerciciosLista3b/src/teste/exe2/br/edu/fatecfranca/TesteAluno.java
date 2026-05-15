/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe2.br.edu.fatecfranca;

import ex2.br.edu.fatecfranca.Aluno;

/**
 *
 * @author jr_ac
 */
public class TesteAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno = new Aluno() {
            {
                setIdade(15);
                setNome("Joaquim");
                setNumeroAluno(1);
                setP1(5f);
                setP2(9f);
            }
        };
        aluno.notaFinal();
        aluno.dadosAluno();
        aluno.passou();
    }

}
