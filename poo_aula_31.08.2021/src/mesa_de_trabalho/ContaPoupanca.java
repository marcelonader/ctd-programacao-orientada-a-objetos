package mesa_de_trabalho;

public class ContaPoupanca extends Conta {

    private double taxaJuros;

    ContaPoupanca(double saldo, Cliente cliente, double taxaJuros){
        super(saldo, cliente);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(double quantia) {
        if(quantia > this.getSaldo())
            System.out.println("=========SAQUE NÃO REALIZADO=========\nMotivo: Saldo Insuficiente.");
        else if (quantia <= this.getSaldo())
            this.setSaldo(this.getSaldo() - quantia);
    }

    public void cobrarJuros(){
        this.setSaldo(this.getSaldo()+this.taxaJuros);
    }
}
