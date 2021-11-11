package aula10.mesa_de_trabalho;

import aula10.mesa_de_trabalho.Asteroide;

public class Main {
    public static void main(String[] args) {

        Nave nave1 = new Nave(10, 30, 'N', 300.00);

        nave1.girar('O');
        System.out.println(nave1.getDirecao());

        Asteroide asteroide1 = new Asteroide(10, 30, 'N', 10);

        nave1.restaVida(asteroide1.getDanos());

        nave1.irA(30, 50, 'L' );
    }
}
