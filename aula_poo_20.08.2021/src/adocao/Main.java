package adocao;

public class Main {
    public static void main(String[] args) {
        Cachorro bob = new Cachorro();

        bob.encaminharParaAdocao();
        bob.setPeso(7.0);
        bob.setAnoNascimento(2013);
        bob.getPeso();
        bob.getAnoNascimento();
        System.out.println(bob.saberIdade(2021));

    }
}
