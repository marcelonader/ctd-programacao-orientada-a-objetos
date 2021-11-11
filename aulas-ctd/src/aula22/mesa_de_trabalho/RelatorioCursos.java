package aula22.mesa_de_trabalho;

import java.util.ArrayList;

public class RelatorioCursos {

    private ArrayList<PrecoCurso> listaPacotesCursos;

    public RelatorioCursos() {
        this.listaPacotesCursos = new ArrayList<>();
    }

    public void addPacoteOuCurso (PrecoCurso pacoteOuCurso) {
        this.listaPacotesCursos.add(pacoteOuCurso);
    }

    public void relatorioCursos () {

        for (PrecoCurso pacoteOuCurso : listaPacotesCursos) {
            System.out.println("Nome do curso: " + pacoteOuCurso);
            System.out.println("Preço: R$" + pacoteOuCurso.calcularPrecoHora());
        }

    }



}
