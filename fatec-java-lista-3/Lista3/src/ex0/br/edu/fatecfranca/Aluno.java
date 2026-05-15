package ex0.br.edu.fatecfranca;

import javax.swing.JOptionPane;

public class Aluno {

    private float n1, n2, media;

    public Aluno(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.media = 0;
    }

    public Aluno() {
        this.n1 = 0;
        this.n2 = 0;
        this.media = 0;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        if (n1 >= 0) {
            this.n1 = n1;
        } else {
            JOptionPane.showMessageDialog(null, "Nota 1 inválida, o valor 0 foi atribuído");
            this.n1 = 0;
        }
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        if (n2 >= 0) {
            this.n2 = n2;
        } else {
            JOptionPane.showMessageDialog(null, "Nota 2 inválida, o valor 0 foi atribuído");
            this.n2 = 0;
        }
    }

    public float getMedia() {
        return media;
    }

    private void setMedia(float media) {
        if (media >= 0) {
            this.media = media;
        }
    }

    public void calculaMedia() {
        this.setMedia((this.n1 + this.n2) / 2);
    }
}
