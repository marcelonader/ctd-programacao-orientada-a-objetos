package aula20.mesa_de_trabalho;

public interface Estado {

    public void adicionarProduto(Produto produto);
    public void cancelarCarrinho();
    public void retornarAoPontoAnterior();
    public void irParaProximoEstado();

}
