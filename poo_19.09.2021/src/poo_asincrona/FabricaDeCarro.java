package poo_asincrona;

public class FabricaDeCarro {
    private static FabricaDeCarro instance = new FabricaDeCarro();
    protected int totalCarrosFiat;
    protected int totalCarrosFord;
    protected int totalCarrosVolks;

    private FabricaDeCarro(){

    }
    public static FabricaDeCarro getInstance(){
        return instance;
    }
    public String criarCarroVolks() {
        return new String("Carro Volks #" + totalCarrosVolks++ + " criado.");
    }

    public String criarCarroFord() {
        return new String("Carro Ford #" + totalCarrosFord++ + " criado.");
    }

    public String criarCarroFiat() {
        return new String("Carro Fiat #" + totalCarrosFiat++ + " criado.");
    }

    public String gerarRelatorio() {
        return new String("Total de carros Fiat vendidos: " + totalCarrosFiat
                + "\nTotal de carros Ford vendidos: " + totalCarrosFord
                + "\nTotal de carros Volks vendidos: " + totalCarrosVolks);
    }


}
