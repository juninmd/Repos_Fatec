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
public class Onibus {

    private String numero;
    private ArrayList<Passageiro> passageiro;

    public Onibus(ArrayList<Passageiro> passageiro, String numero) {
        this.passageiro = passageiro;
        this.numero = numero;
    }

    public Onibus() {
        this.passageiro = new ArrayList<>();
        this.numero = "";
    }

    public int getQtdePassageiros() {
        return this.passageiro.size();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Passageiro> getPassageiro() {
        return this.passageiro;
    }

    public void setPassageiro(ArrayList<Passageiro> passageiro) {
        this.passageiro = passageiro;
    }

    //
    // CRUD 
    //mostra -ok
    //criaPassageiro -ok
    //removePassageiro -ok
    //consultaPassageiro -boolean -ok    
    //consultaPassageiro-boolean -ok
    //consultaPassageiro-int -ok
    //atualizaPassageiro -ok
    //
    public String mostra() {
        String texto = "Número do Bus: " + this.getNumero();
        for (int i = 0; i < this.passageiro.size(); i++) {
            texto += "\n" + this.passageiro.get(i).mostra();
        }
        return texto;
    }

    public void associaPassageiro(Passageiro passageiro) {
        this.passageiro.add(passageiro);
    }

    public boolean desvinculaPassageiro(Passageiro passageiro) {
        return this.passageiro.remove(passageiro);
    }

    public boolean obterPassageiro(Passageiro passageiro) {
        return this.passageiro.contains(passageiro);
    }

    private int obterPosicaoPassageiro(Passageiro passageiro) {
        return this.passageiro.indexOf(passageiro);
    }

    public boolean atualizaPassageiro(Passageiro passageiro) {
        int i = this.obterPosicaoPassageiro(passageiro);
        if (i >= 0) {
            this.passageiro.set(i, passageiro);
            return true;
        }
        return false;
    }

}
