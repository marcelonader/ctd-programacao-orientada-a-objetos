package aula22;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("X-tudo", 20.0);
        Produto produto2 = new Produto("batata frita", 25.0);
        Combo combo = new Combo();

        combo.addProduto(produto);
        combo.addProduto(produto2);
        System.out.println(combo.calcularPreco());

    }
}
