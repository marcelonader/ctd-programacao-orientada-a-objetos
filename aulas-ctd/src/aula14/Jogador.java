package aula14;

public class Jogador  implements Comparable<Jogador>{

    private int numCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public Jogador(int numCamisa, String nome, boolean lesionado, boolean titular) {
        this.numCamisa = numCamisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    @Override
    public int compareTo(Jogador jogador) {
        if (this.numCamisa == jogador.getNumCamisa())
            return 0;
        else if(this.numCamisa > jogador.getNumCamisa())
            return 1;
        else
            return -1;

    }


}



