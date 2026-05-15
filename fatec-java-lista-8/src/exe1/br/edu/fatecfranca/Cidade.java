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
public class Cidade {

    public void contrata(Professor p) {
        p.Ensina();
        p.Trabalha();
    }

    public void contrata(Empregado e) {
        e.Trabalha();
    }

    public void cobraDe(Contribuinte c) {
        c.PagaIR();
    }

    public void registra(Cidadao c) {
        c.GetRg();
    }

    public void alimenta(Animal a) {
        a.Come();
    }

}
