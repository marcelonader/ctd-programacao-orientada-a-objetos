package jogo_poo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UsuarioJogo jogador1 = new UsuarioJogo("Marcelo", "marcelonader");
        UsuarioJogo jogador2 = new UsuarioJogo("Vitor", "vitão");

        jogador1.setNivel(3);
        System.out.println("\nNickname: " + jogador1.getNickname());
        System.out.println("Nível: " + jogador1.getNivel());
        System.out.println("Pontuação: " + jogador1.getPontuacao());
        jogador1.aumentarPontuacao();
        jogador1.subirNivel();
        jogador2.aumentarPontuacao();
        jogador2.subirNivel();
        jogador2.subirNivel();
        jogador2.subirNivel();
        System.out.println("\nNickname: " + jogador2.getNickname());
        System.out.println("Nível: " + jogador2.getNivel());
        System.out.println("Pontuação: " + jogador2.getPontuacao());
        jogador1.bonus(4);
        System.out.println("\nNickname: " + jogador1.getNickname());
        System.out.println("Nível: " + jogador1.getNivel());
        System.out.println("Pontuação: " + jogador1.getPontuacao());

    }
}
