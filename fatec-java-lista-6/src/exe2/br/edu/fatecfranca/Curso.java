/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2.br.edu.fatecfranca;

import java.util.ArrayList;

/**
 *
 * @author jr_ac
 */
public class Curso {

    private int qtdeDisciplinas;
    private int codigo;
    private String nome;
    public ArrayList<Disciplina> listaDisciplinas;

    public Curso(int qtdeDisciplinas, int codigo, String nome) {
        this.listaDisciplinas = new ArrayList();
        this.qtdeDisciplinas = qtdeDisciplinas;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Curso() {
        this.listaDisciplinas = new ArrayList();
        this.nome = "";
        this.codigo = 0;
        this.qtdeDisciplinas = 0;
    }

    public int getQtdeDisciplinas() {
        return listaDisciplinas.size();
    }

    public void setQtdeDisciplinas(int qtdeDisciplinas) {
        this.qtdeDisciplinas = qtdeDisciplinas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void criaDisciplinaObrigatoria() {
        listaDisciplinas.add(new Obrigatoria() {
            {
                this.setNroCreditos(6);
                this.setNome("Goku");
                this.setTipo("ñsei");

            }
        });
    }

    public void criaDisciplinaOptativa() {
        listaDisciplinas.add(new Optativa() {
            {
                this.setNroCreditos(2);
                this.setNome("Cell");
                this.setTipo("ñseitbm");

            }
        });
    }

    public Curso obterCurso() {
        return new Curso();
    }

    public String emiteInformacoesDisciplinasCurso() {
        String text = "\nQuantidade Disciplinas:" + this.qtdeDisciplinas
                + "\nCódigo: " + this.codigo
                + "\nNome: " + this.nome;
        for (int i = 0; i < listaDisciplinas.size(); i++) {
            text += "\n" + listaDisciplinas.get(i).emiteDisciplina();
        }
        return text;
    }
}
