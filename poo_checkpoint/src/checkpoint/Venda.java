package checkpoint;

public class Venda {
    private String dataDaVenda;
    private String produtoVendido;
    private int quantidadeVendida;
    private double precoUnitarioDoProdutoVendido;
    private double precoTotal;

    public Venda(String dataDaVenda, String produtoVendido, int quantidadeVendida, double precoUnitarioDoProdutoVendido
            , double precoTotal) {
        this.dataDaVenda = dataDaVenda;
        this.produtoVendido = produtoVendido;
        this.quantidadeVendida = quantidadeVendida;
        this.precoUnitarioDoProdutoVendido = precoUnitarioDoProdutoVendido;
        this.precoTotal = precoTotal;
    }

    public String getDataDaVenda() {
        return dataDaVenda;
    }
    public void setDataDaVenda(String dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }
    public String getProdutoVendido() {
        return produtoVendido;
    }
    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }
    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }
    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
    public double getPrecoUnitarioDoProdutoVendido() {
        return precoUnitarioDoProdutoVendido;
    }
    public void setPrecoUnitarioDoProdutoVendido(double precoUnitarioDoProdutoVendido) {
        this.precoUnitarioDoProdutoVendido = precoUnitarioDoProdutoVendido;
    }
    public double getPrecoTotal() {
        return precoTotal;
    }
    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    @Override
    public String toString() {
        return  "\nProduto: " + this.getProdutoVendido() +
                "\nQuantidade: " + this.getQuantidadeVendida() +
                "\nPreço unitário: " + this.getPrecoUnitarioDoProdutoVendido() +
                "\nPreço total: " + this.getPrecoTotal();
    }
}
