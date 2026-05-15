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
public class Standard extends Passageiro {
    private String tipoLanche;

    public Standard(String tipoLanche, String nome, int poltrona, String tipo) {
        super(nome, poltrona, tipo);
        this.tipoLanche = tipoLanche;
    }

    public Standard() {
        super();
        this.tipoLanche="";
    }
    
    public String getTipoLanche() {
        return tipoLanche;
    }

    public void setTipoLanche(String tipoLanche) {
        this.tipoLanche = tipoLanche;
    }
    
    @Override
    public String emitePassageiro(){
        return super.emitePassageiro() + 
                "\nTipo de Lanche:" + this.tipoLanche;
    }
    

}
