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
public class Disciplina {

    private String codigo;
    private ArrayList<Topico> topicos;

    public ArrayList<Topico> getTopicos() {
        return topicos;
    }

    public void setTopicos(ArrayList<Topico> topicos) {
        this.topicos = topicos;
    }

    public Disciplina() {
        this.codigo = "";
        this.topicos = new ArrayList<>();
    }

    public Disciplina(String codigo, ArrayList<Topico> topicos) {
        this.codigo = codigo;
        this.topicos = topicos;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String mostra() {
        String t = "Disciplina:" + this.getCodigo();
        for (int i = 0; i < this.topicos.size(); i++) {
            t = t + "\n" + this.topicos.get(i).mostra();
        }
        return t;
    }
}
