package mesa_de_trabalho;

public class Nave extends Objeto{
     private double velocidade;
     private int vida;

     Nave(int x, int y, char direcao, double velocidade){
         super(x, y, direcao);
         this.velocidade = velocidade;
         this.vida = 100;
     }

     //irA vai ser herdado

    public void girar (char direcao){
        switch (direcao){
            case 'N':
                this.setDirecao(direcao);
                System.out.println("Direção atual da nave: Norte");
                break;
            case 'S':
                this.setDirecao(direcao);
                System.out.println("Direção atual da nave: Sul");
                break;
            case 'L':
                this.setDirecao(direcao);
                System.out.println("Direção atual da nave: Leste");
                break;
            case 'O':
                this.setDirecao(direcao);
                System.out.println("Direção atual da nave: Oeste");
                break;
            default: System.out.println("Direção inválida");
        }
    }


    public void restaVida(int valor){
        this.vida -= valor;
        System.out.println("Sua nave foi atingida.\nVidas restantes: " + this.vida);
    }

}
