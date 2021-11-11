package checkpoint;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pessoa espadachim1 = new Espadachim("houser explorador");
        System.out.println(espadachim1.getAgilidade());
        System.out.println("Você encontrou um poring, deseja lutar?");
        Scanner scanner = new Scanner(System.in);
        int respostaJogador = scanner.nextInt();
        System.out.println(respostaJogador);
        if(respostaJogador == 1){
            while(espadachim1.getPontosVida() > 0 || poring.getPontosVida() > 0){

            }
        }

        //combate


    }
}
