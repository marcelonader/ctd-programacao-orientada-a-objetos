package aula14.mesa_de_trabalho;

public class Main {
    public static void main(String[] args) {
        Conteiner conteiner1 = new Conteiner(14, "Brasil", false);
        Conteiner conteiner2 = new Conteiner(3, "Argentina", true);
        Conteiner conteiner3 = new Conteiner(22, true);

        Porto porto = new Porto("Buenos Aires");

        porto.addConteiner(conteiner1);
        porto.addConteiner(conteiner2);
        porto.addConteiner(conteiner3);

        porto.mostrarConteiner();
        System.out.println(porto.getConteinersPerigosos());

    }
}
