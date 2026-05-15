/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe3.br.edu.fatecfranca;

import exe3.br.edu.fatecfranca.Curso;
import exe3.br.edu.fatecfranca.Disciplina;
import exe3.br.edu.fatecfranca.Topico;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Disciplina matematica = new Disciplina() {
            {
                setCodigo("100");
                setTopicos(new ArrayList<Topico>() {
                    {
                        add(new Topico() {
                            {
                                setAssunto("Multiplicar");
                            }
                        });
                        add(new Topico() {
                            {
                                setAssunto("Dividir");
                            }
                        });
                        add(new Topico() {
                            {
                                setAssunto("Adicionar");
                            }
                        });
                    }
                }
                );
            }
        };

        Disciplina ingles = new Disciplina() {
            {
                setCodigo("200");
                setTopicos(new ArrayList<Topico>() {
                    {
                        add(new Topico() {
                            {
                                setAssunto("Verb to be");

                            }
                        });
                        add(new Topico() {
                            {
                                setAssunto("English numbers");

                            }
                        });
                        add(new Topico() {
                            {
                                setAssunto("Cardinal Numbers");

                            }
                        });
                    }
                }
                );
            }
        };

        Disciplina portugues = new Disciplina() {
            {
                setCodigo("300");
                setTopicos(new ArrayList<Topico>() {
                    {
                        add(new Topico() {
                            {
                                setAssunto("Regras");

                            }
                        });
                        add(new Topico() {
                            {
                                setAssunto("Advejtivos");

                            }
                        });
                        add(new Topico() {
                            {
                                setAssunto("Teste");

                            }
                        });
                    }
                });
            }
        };

        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(matematica);
        disciplinas.add(ingles);
        disciplinas.add(portugues);

        // TODO code application logic here
        Curso curso = new Curso() {
            {
                setNome("ADS");
            }
        };
        curso.setDisciplina(disciplinas);

        JOptionPane.showMessageDialog(null, curso.mostra());
    }
}
