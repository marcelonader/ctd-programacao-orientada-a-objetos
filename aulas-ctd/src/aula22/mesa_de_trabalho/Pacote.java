package aula22.mesa_de_trabalho;

import java.util.ArrayList;

public class Pacote implements PrecoCurso {

    private String nomePacote;
    private ArrayList<PrecoCurso> listaCursos;

    public Pacote (String nomePacote) {
        this.nomePacote = nomePacote;
        this.listaCursos = new ArrayList<>();
    }

    public void addCurso (PrecoCurso curso) {
        this.listaCursos.add(curso);
    }

    @Override
    public double calcularPrecoHora () {
        double valorTotal = 0;

        for (PrecoCurso curso : listaCursos) {
            valorTotal += curso.calcularPrecoHora();
        }
        return valorTotal * 0.8;
    }

    public String getNomePacote() {
        return nomePacote;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }



}
