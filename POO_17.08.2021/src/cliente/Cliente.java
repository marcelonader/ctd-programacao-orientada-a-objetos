package cliente;

public class Cliente {
    private String numeroCliente;
    private String nome;
    private double divida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Cliente(String numeroCliente, String nome){
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0;
    }
    public void aumentarDivida (Double valor){

    }
    public void pagarDivida (){

    }
}
