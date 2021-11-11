package aula13;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor > getSaldo()) {
            System.out.println("saldo insuficiente");
        } else {
            setSaldo(Math.round((getSaldo() - valor)*100.0)/100.0);
            System.out.println("Você sacou valor de: R$ " + valor);
        }
    }

    public void cobrarJuros(){
        double rendimento = Math.round((this.getSaldo() * 100)*100.0)/100.0;
        System.out.println("O rendimento projetado da sua conta é de: R$ " + rendimento);
    }
}
