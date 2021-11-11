package aula20;

public class Triste implements Estado{

    private Tamagochi t;

    public Triste(Tamagochi t){
        this.t = t;
    }
    @Override
    public void come() {

        System.out.println("Beep Beep - vomitando");
    }

    @Override
    public void bebe() {
        System.out.println("Beep, Beep, Beep - pisca");
    }

    @Override
    public void carinho() {
        t.setEstado(new Feliz(t));
    }
}
