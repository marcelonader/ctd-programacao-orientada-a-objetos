package checkpoint;

public class Bichos {
    private

    public Pessoa(String nickname) {
        this.nickname = nickname;
        this.nivel = 0;
        this.estaAbencoado = false;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public boolean isEstaAbencoado() {
        return estaAbencoado;
    }

    public void setEstaAbencoado(boolean estaAbencoado) {
        this.estaAbencoado = estaAbencoado;
    }

    private int forca;
    private int vitalidade;
    private int destreza;
    private int pontosVida;
    private boolean estaAbencoado;

    public void atacar(Pessoa pessoa) {
        int forcaAtaque = this.forca + ((this.forca / 2) * (this.destreza + this.agilidade));
        pessoa.setPontosVida(pessoa.pontosVida -= forcaAtaque);
    }
}
