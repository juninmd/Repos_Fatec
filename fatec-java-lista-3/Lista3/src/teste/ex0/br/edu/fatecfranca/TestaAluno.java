package teste.ex0.br.edu.fatecfranca;

import ex0.br.edu.fatecfranca.Aluno;
import javax.swing.JOptionPane;

public class TestaAluno {

    public static void main(String[] args) {
        Aluno obj1 = new Aluno() {
            {
                setN1(7.f);
                setN2(8f);
                calculaMedia();
            }
        };

        JOptionPane.showMessageDialog(null, "A média do aluno é de " + obj1.getMedia());
    }

}
