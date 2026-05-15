package ex2.br.edu.fatecfranca;

import javax.swing.JOptionPane;

/**
 *
 * @author anton
 */
public class Aluno {

    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    public void notaFinal() {
        JOptionPane.showMessageDialog(null, (this.p1 + this.p2) / 2);
    }

    public void dadosAluno() {
        JOptionPane.showMessageDialog(null, "Número Aluno: " + this.numeroAluno + "\n"
                + "Nome: " + this.nome + "\n"
                + "Idade: " + this.idade);
    }

    public Aluno() {
    }

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        if (String.valueOf(numeroAluno).length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            JOptionPane.showMessageDialog(null, "Número do aluno inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 30) {
            JOptionPane.showMessageDialog(null, "O nome do aluno não pode ultrapassar 30 caracteres");
            this.nome = "";
        } else if ("".equals(nome)) {
            JOptionPane.showMessageDialog(null, "Preencha o nome do aluno");
        } else {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            JOptionPane.showMessageDialog(null, "A idade não pode ser negativa");
            this.idade = 0;
        }

    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1 > 0) {
            this.p1 = p1;
        } else {
            JOptionPane.showMessageDialog(null, "A nota p1 não pode ser negativa");
            this.p1 = 0;
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 > 0) {
            this.p2 = p2;
        } else {
            JOptionPane.showMessageDialog(null, "A nota p2 não pode ser negativa");
            this.p2 = 0;
        }
    }

    public void passou() {
        JOptionPane.showMessageDialog(null, ((this.p1 + this.p2) / 2) >= 6 ? "Passou" : "Pegou DP");
    }
}
