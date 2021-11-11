package aula22;

import java.util.ArrayList;

public class Combo implements Item {

    private ArrayList<Item> listaProdutos;

    public Combo(){
        this.listaProdutos = new ArrayList<>();
    }


    public void addProduto(Item item){
        this.listaProdutos.add(item);
    }

    @Override
    public double calcularPreco() {
        double valorTotal = 0.0;

        for (Item item : listaProdutos) {
            valorTotal += item.calcularPreco();
        }

        return valorTotal;
    }
}
