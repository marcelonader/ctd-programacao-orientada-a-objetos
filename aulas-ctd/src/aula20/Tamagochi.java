package aula20;

public class Tamagochi {
    private Estado estado;

    public Tamagochi(){
        setEstado(new Fome(this));
    }

    public Estado getEstado() {

        return estado;
    }

    public void setEstado(Estado estado) {

        this.estado = estado;
    }

    public void come(){
        getEstado().come();
    }

    public void bebe(){
        getEstado().bebe();
    }

    public void carinho(){
        getEstado().carinho();
    }
}
