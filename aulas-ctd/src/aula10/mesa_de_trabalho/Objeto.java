package aula10.mesa_de_trabalho;

public class Objeto {
    private int posx;
    private int posy;
    private char direcao;



    Objeto (int x, int y, char direcao){
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
    }

    public void irA(int x, int y, char direcao){
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
        System.out.println("==========Coordenadas==========" + "\nPosição no eixo X: "+ this.posx + "\nPosição no eixo Y: "+ this.posy + "\nDireção: " + this.direcao);
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }
}
