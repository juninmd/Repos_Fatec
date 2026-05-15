package ex1.br.edu.fatecfranca;

import javax.swing.JOptionPane;

public class Cliente {

    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente() {
        this.numeroConta = "";
        this.numeroAgencia = "";
        this.nome = "";
        this.saldo = 0f;
    }

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    //número da conta deve obrigatoriamente ter tamanho 8, contando o traço do dígito verificador
    public void setNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8 || numeroConta.charAt(6) != '-') {
            JOptionPane.showMessageDialog(null, "Número de conta inválido!");
            return;
        }
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    //número da agência deve ter tamanho 6 também contendo traço do dígito verificador, 
    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() != 6 || numeroAgencia.charAt(4) != '-') {
            JOptionPane.showMessageDialog(null, "Número de agência inválida!");
            return;
        }
        this.numeroAgencia = numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    //O nome do cliente não pode ultrapassar 30 caracteres. 
    public void setNome(String nome) {
        if (nome.length() > 30) {
            JOptionPane.showMessageDialog(null, "O nome do cliente não pode ultrapassar 30 caracteres!");
            return;
        }
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void realizarDeposito(float saldo) {
        this.saldo += saldo;
    }

    public void realizarSaque(float saldo) {
        if (this.saldo >= saldo) {
            this.saldo -= saldo;
            return;
        }
        JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar saque!");
    }

    public String mostra() {
        return this.nome + "\n"
                + this.numeroAgencia + "\n"
                + this.numeroConta + "\n"
                + this.saldo + "\n";
    }
}
