package checkpoint;

public class Toalha extends Produto{

    private String tamanho;
    private String cor;

    public Toalha(String nome, double preco, int quantidade, String tamanho, String cor) {
            super(nome, preco, quantidade);
            this.setCategoria("Toalha");
            this.tamanho=tamanho;
            this.cor=cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "\nIdentificador: " + this.getIdentificador()+
                "\nNome: " + this.getNome() +
                "\nPreço: R$ " + this.getPreco() +
                "\nCor: " + this.getCor() +
                "\nTamanho: " + this.getTamanho() +
                "\nCategoria: " + this.getCategoria()+
                "\nQuantidade em estoque: " + this.getQuantidade()+
                "\nValor total dos produtos em estoque: R$ " + this.getValorTotalEmEstoque();
    }

}


