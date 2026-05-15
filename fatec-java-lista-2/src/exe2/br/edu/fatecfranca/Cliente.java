/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2.br.edu.fatecfranca;

/**
 *
 * @author jr_ac
 */
public class Cliente {

    public String numeroConta;
    public String numeroAgencia;
    public String nome;
    public static float saldo;

    public Cliente() {
        this.numeroConta = "";
        this.numeroAgencia = "";
        this.nome = "";
    }

    public Cliente(String numeroConta, String numeroAgencia, String nome) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
    }

    public void realizarDeposito(float saldo) {
        Cliente.saldo += saldo;
    }

    public boolean realizarSaque(float saldo) {
        if(Cliente.saldo >= saldo){
            Cliente.saldo -= saldo;
            return true;
        }
        return false;
    }
    
    public String mostra(){
        return "Número da Conta: "+this.numeroConta + "\n"+
                "Número da agência: "+this.numeroAgencia +"\n"+
                "Nome: "+this.nome +"\n"+
                "Saldo: "+Cliente.saldo;
    }

     public static void alteraSaldo(float saldo){
         Cliente.saldo = saldo;
     }
     
     public static float retornaSaldo(){
         return Cliente.saldo;
     }
     
     public void alteraAgencia(String numeroAgencia){
         this.numeroAgencia = numeroAgencia;
     }
     public String retornaAgencia(){
         return this.numeroAgencia; 
     }
     public static Cliente retornaNovoCliente(Cliente cliente1, Cliente cliente2){
         Cliente novocliente = new Cliente(){{
              numeroAgencia = cliente1.numeroAgencia;
              numeroConta = cliente2.numeroConta;
              nome = "Novo Cliente Fulano";
              saldo = Cliente.saldo + Cliente.saldo;
         }};
         return novocliente;
     }
     public static boolean verificaTamanho(String numeroAgencia){
         return numeroAgencia.length() == 6;
     }
}
