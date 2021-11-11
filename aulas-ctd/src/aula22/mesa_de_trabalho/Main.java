package aula22.mesa_de_trabalho;

public class Main {
    public static void main(String[] args) {
        Curso frontend = new Curso("Frontend", 1000, 32);

        Curso backend = new Curso("Backend",900, 40);

        Pacote fullstack = new Pacote("Fullstack");

        fullstack.addCurso(backend);
        fullstack.addCurso(frontend);

        RelatorioCursos relatorioCursos = new RelatorioCursos();

        relatorioCursos.addPacoteOuCurso(fullstack);
        relatorioCursos.addPacoteOuCurso(backend);
        relatorioCursos.addPacoteOuCurso(frontend);

        System.out.println("O preço do curso " + frontend.getNome() + " é de R$ " + frontend.calcularPrecoHora());

        System.out.println("O preço do curso " + backend.getNome() + " é de R$ " + backend.calcularPrecoHora());

        System.out.println("O preço do curso " + fullstack.getNomePacote() + " é de R$ " + fullstack.calcularPrecoHora());

        relatorioCursos.relatorioCursos();

    }

}
