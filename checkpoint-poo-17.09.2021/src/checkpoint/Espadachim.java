package checkpoint;

import java.util.Scanner;

public class Espadachim extends Pessoa implements EquiparDesequiparArma, EquiparDesequiparVestimenta {
    private Arma armaEquipada;
    private Vestimenta vestimentaEquipada;

    Scanner scanner = new Scanner(System.in);

    public Espadachim(String nickname) {
        super(nickname);
        this.agilidade = 2;
        this.forca = 7;
        this.vitalidade = 4;
        this.destreza = 3;
        this.pontosVida = 100;
    }

    @Override
    public void subirDeClasse() {
        if(this.nivel >= 40){
            System.out.println("Muito bem, você desbloqueou uma nova classe. Agora terá que escolher qual especialidade seguirá.");
        }
        System.out.println();
    }


    @Override
    public void equiparArma(Arma arma) {

    }

    @Override
    public void desequiparArma(Arma arma) {

    }

    @Override
    public void equiparVestimenta(Vestimenta vestimenta) {

    }

    @Override
    public void desequiparVestimenta(Vestimenta vestimenta) {

    }
}
