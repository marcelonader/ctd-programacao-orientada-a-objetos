package jokenpo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        JokenPo partida = new JokenPo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quer jogar Joken Po? Digite \"S\" para sim, e \"N\" para não");
        String respostaUsuario = scanner.next();
        switch (respostaUsuario.toLowerCase(Locale.ROOT)) {
            case "s":
                partida.jogar();
                break;
            case "n":
                System.out.println("Ok, vamos deixar para a próxima");
                break;
            default:
                System.out.println("Opção inválida.");
                while (!respostaUsuario.toLowerCase(Locale.ROOT).equals("s") || !respostaUsuario.toLowerCase(Locale.ROOT).equals("n")){
                    System.out.println("Digite \"S\" para sim, e \"N\" para não");
                    respostaUsuario = scanner.next();
                    if(respostaUsuario.equals("s")){
                        partida.jogar();
                        break;
                    } else if(respostaUsuario.equals("n")){
                        System.out.println("Ok, vamos deixar para a próxima");
                        break;
                    }
                }

        }


    }
}