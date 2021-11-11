package poo_asincrona;

public class TesteFabrica {
    public static void main(String[] args) {

        FabricaDeCarro.getInstance();

        System.out.println(FabricaDeCarro.getInstance().criarCarroFiat());
        System.out.println(FabricaDeCarro.getInstance().criarCarroFiat());
        System.out.println(FabricaDeCarro.getInstance().criarCarroFiat());


    }

}
