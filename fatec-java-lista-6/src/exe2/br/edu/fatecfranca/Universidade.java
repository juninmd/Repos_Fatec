/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2.br.edu.fatecfranca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class Universidade {

    private int qtdeCursos;
    private String nome;
    private String cidade;
    private ArrayList<Curso> listaCursos;

    public Universidade(int qtdeCursos, String nome, String cidade) {
        this.qtdeCursos = qtdeCursos;
        this.nome = nome;
        this.cidade = cidade;
        this.listaCursos = new ArrayList();
    }

    public Universidade() {
        this.qtdeCursos = 0;
        this.nome = "";
        this.cidade = "";
        this.listaCursos = new ArrayList();
    }

    public int getQtdeCursos() {
        return qtdeCursos;
    }

    public void setQtdeCursos(int qtdeCursos) {
        this.qtdeCursos = qtdeCursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void criaCurso() {
        listaCursos.add(new Curso(1, 1, "Vida"));
    }

    public String emiteCurso() {
        String text = "\n Quant. de Cursos: " + this.qtdeCursos
                + "\n Nome: " + this.nome
                + "\n Cidade: " + this.cidade;
        for (int i = 0; i < listaCursos.size(); i++) {
            Curso curso = listaCursos.get(i);
            text += curso.emiteInformacoesDisciplinasCurso();

            for (int j = 0; j < curso.getQtdeDisciplinas(); j++) {
                text += curso.listaDisciplinas.get(j).emiteDisciplina();
            }
        }
        return text;
    }

    public Curso obterCurso(int posicao) {
        if (listaCursos.indexOf(posicao) != -1) {
            return listaCursos.get(posicao);
        }
        JOptionPane.showMessageDialog(null, "Curso não encontrado!");
        return new Curso();
    }

    public void criaDisciplinaObrigatoriaCurso(int index) {
        if (listaCursos.indexOf(index) != -1) {
            listaCursos.get(index).criaDisciplinaObrigatoria();
        }
    }

    public void criaDisciplinaOptativaCurso(int index) {
        if (listaCursos.indexOf(index) != -1) {
            listaCursos.get(index).criaDisciplinaOptativa();
        }
    }
}
