package aula14;

public class Main {
    public static void main(String[] args) {

        Jogador silas = new Jogador(10, "Silas", false, true);
        Jogador sophia = new Jogador(9, "Sophia", true, true);

        Equipe turma02 = new Equipe("Turma 02");

        turma02.addJogador(silas);
        turma02.addJogador(sophia);

        turma02.mostrarJogadoresTitulares();
        System.out.println("Jogadores Lesionados: " + turma02.getQuantidadeJogadoresLesionados());

    }
}
