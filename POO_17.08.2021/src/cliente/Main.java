package cliente;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cliente cliente = new Cliente("2", "Marcelo");

        System.out.println(cliente.getNome());
        System.out.println(cliente.getDivida());
        cliente.setDivida(2.34);
        System.out.println(cliente.getDivida());
    }
}
