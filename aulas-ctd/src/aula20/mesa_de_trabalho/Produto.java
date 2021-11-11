package aula20.mesa_de_trabalho;

public class Produto {

    private String descricao;
    private Double preco;

    public Produto(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }
}
