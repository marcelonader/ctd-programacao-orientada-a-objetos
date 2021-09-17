package checkpoint;

public class Chaveiro extends Produto{

    private String tamanho;
    private String material;

    public Chaveiro(String nome, double preco, int quantidade, String tamanho, String material) {
        super(nome, preco, quantidade);
        this.tamanho=tamanho;
        this.material=material;
        this.setCategoria("Chaveiro");
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return  "\nIdentificador: " + this.getIdentificador()+
                "\nNome: " + this.getNome() +
                "\nPreço: R$ " + this.getPreco() +
                "\nTamanho: " + this.getTamanho() +
                "\nMaterial: " + this.getMaterial() +
                "\nCategoria: " + this.getCategoria()+
                "\nQuantidade em estoque: " + this.getQuantidade()+
                "\nValor total dos produtos em estoque: R$ " + this.getValorTotalEmEstoque();
    }
}


