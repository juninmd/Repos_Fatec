/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe2.be.edu.fatecfranca;

import exe2.br.edu.fatecfranca.Curso;
import exe2.br.edu.fatecfranca.Disciplina;
import exe2.br.edu.fatecfranca.Universidade;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class TestaUniversidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Disciplina disciplina = new Disciplina (4,"Matematica", "exata");
        JOptionPane.showMessageDialog(null,disciplina.emiteDisciplina());
        
        Curso curso = new Curso (7,20,"ADS");
        curso.criaDisciplinaObrigatoria();
        curso.criaDisciplinaOptativa();
        curso.obterCurso();
        JOptionPane.showMessageDialog(null,curso.emiteInformacoesDisciplinasCurso());
        
        Universidade universidade = new Universidade (9,"Facul","Franca");
        universidade.criaCurso();
        universidade.criaCurso();
        universidade.obterCurso(2);
        universidade.criaDisciplinaObrigatoriaCurso(3);
        universidade.criaDisciplinaOptativaCurso(0);
        JOptionPane.showMessageDialog(null,universidade.emiteCurso());
    }
    
}
