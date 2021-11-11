package mesa_de_trabalho;

public abstract class Conta {
    private double saldo;
    private Cliente cliente;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    Conta(double saldo, Cliente cliente){
        this.saldo = saldo;
        this.cliente = cliente;
    };
    public void depositar(double quantia){
        this.saldo += quantia;
    };
    public abstract void sacar(double quantia);

    public void mostrarSaldo(){
        this.getSaldo();
    };
}
