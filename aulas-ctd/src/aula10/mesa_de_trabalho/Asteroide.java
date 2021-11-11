package aula10.mesa_de_trabalho;

public class Asteroide extends Objeto {
    private int danos;

   Asteroide(int x, int y, char direcao, int danos){
        super(x, y, direcao);
        this.danos = danos;
   }

    //irA vai ser herdado


    public int getDanos() {
        return danos;
    }

    public void setDanos(int danos) {
        this.danos = danos;
    }
}
