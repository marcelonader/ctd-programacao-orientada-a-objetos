package checkpoint;

public class Produto {
    private String nome;
    private int identificador;
    private String categoria;
    private double preco;
    private int quantidade;

    static int contador = 00001;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.identificador = this.contador;
        this.preco = preco;
        this.quantidade = quantidade;
        contador++;
    }

    public void adicionarProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void venderProduto(int quantidade){
        if(quantidade > this.quantidade){
            System.out.println("Não há produtos suficientes no estoque");
        } else {
            this.quantidade -= quantidade;
            System.out.println("\n ====================== INFORMAÇÕES DA VENDA REALIZADA ======================\n");
            System.out.println("Você vendeu " + quantidade + " unidade(s) de: " + this.nome);
            System.out.println("Preço obtido com a venda: R$ "+quantidade*this.preco);
            System.out.println("Quantidade restante em estoque: "+ this.quantidade);
        }
    }

    public double getValorTotalEmEstoque() {
        return this.preco * this.quantidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
