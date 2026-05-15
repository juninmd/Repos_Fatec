/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3.br.edu.fatecfranca;

import java.util.ArrayList;

/**
 *
 * @author jr_ac
 */
public class Curso {

    private String nome;
    private ArrayList<Disciplina> disciplina;

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public Curso(String nome, ArrayList<Disciplina> discipina) {
        this.nome = nome;
        this.disciplina = discipina;
    }

    public Curso() {
        this.nome = "";
        this.disciplina = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String mostra() {
        String t = "Curso: " + this.getNome();
        for (int i = 0; i < this.disciplina.size(); i++) {
            t = t + "\n" + "\n" + this.disciplina.get(i).mostra();
        }
        return t;
    }

}
