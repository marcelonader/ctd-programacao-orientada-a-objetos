package mesa_de_trabalho;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente marcelo = new Cliente(123, "Nader", "111.111.111-11");

        ContaPoupanca conta01 = new ContaPoupanca(1000.00, marcelo, 1);

        System.out.println(conta01.getSaldo());
    }
}
