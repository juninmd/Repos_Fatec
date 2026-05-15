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
public class Veiculo {

    public String Tipo;
    public int nroRodas;
    public String cor;
    public int ano;
    public static String nomeDono;
    
    public Veiculo(){
        this.Tipo = "";
        this.nroRodas = 0;
        this.cor = "";
        this.ano = 0;
    }
    public Veiculo(String Tipo, int nroRodas, String cor, int ano){
        this.Tipo = Tipo;
        this.nroRodas = nroRodas;
        this.cor = cor;
        this.ano = ano;
    }
    public void alteraTipo(String Tipo){
        this.Tipo = Tipo;
    }
    
    public String mostra(){
        return "Dono: "+Veiculo.nomeDono+"\n"+
                "Tipo: "+this.Tipo+"\n"+
                "Rodas:"+ this.nroRodas+"\n"+
                "Cor:"+this.cor+"\n"+
                "Ano:"+this.ano;
    }
    
    public static void alteraNome(String nomeDono){
        Veiculo.nomeDono = nomeDono;
    }
    public static String retornaNome(){
        return Veiculo.nomeDono;
    }
    public static boolean nroRodas(int nroRodas){
        return nroRodas % 2 == 0;
    }
    
    public static Veiculo retornaNovoVeiculo(Veiculo veiculo1, Veiculo veiculo2){
        Veiculo novoVeiculo = new Veiculo(){{
           Tipo = veiculo1.Tipo; 
           nroRodas = veiculo1.nroRodas + veiculo2.nroRodas;
           cor = veiculo2.cor;
           ano = veiculo1.ano > veiculo2.ano ? veiculo1.ano : veiculo2.ano;
        }};
        return novoVeiculo;
    } 
}
