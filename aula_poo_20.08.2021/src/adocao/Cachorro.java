package adocao;

public class Cachorro {

    private boolean estaAptoParaAdocao;
    private String raca;
    private int anoNascimento;
    private double peso;
    private boolean possuiChip;
    private boolean estaFerido;
    private String primeiroNome;

    Cachorro(String primeiroNome, String raca, int anoNascimento, double peso, boolean possuiChip, boolean estaFerido){
        this.primeiroNome = primeiroNome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.possuiChip = possuiChip;
        this.estaFerido = estaFerido;
    }


    Cachorro(){
        this.estaFerido = false;
        this.possuiChip = false;
    }

    public int saberIdade(int anoAtual){
        return anoAtual - this.anoNascimento;
    }

    public String validarChip(){
        if(possuiChip)
            return "O chip está validado.";
        else
            return "O animal não possui chip.";

    }

    public void encaminharParaAdocao(){
        if(estaFerido == false && peso > 5) {
            estaAptoParaAdocao = true;
            System.out.println("O cachorro está apto para adoção.");
        } else {
            estaAptoParaAdocao = false;
            System.out.println("O cachorro não está apto para adoção.");
        }
    }


    public boolean isEstaAptoParaAdocao() {
        return estaAptoParaAdocao;
    }

    public void setEstaAptoParaAdocao(boolean estaAptoParaAdocao) {
        this.estaAptoParaAdocao = estaAptoParaAdocao;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isPossuiChip() {
        return possuiChip;
    }

    public void setPossuiChip(boolean possuiChip) {
        this.possuiChip = possuiChip;
    }

    public boolean isEstaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
}
