package aula19;

public class Main {
    public static void main(String[] args) {
        Empresa dh = new Empresa("555666");

        EmpregadoFactory factory = EmpregadoFactory.getInstance(); // singleton

        Empregado empregado1 = dh.addEmpregado(factory.criarEmpregado("R"));

        empregado1.setNome("Yana");

        Empregado c = factory.criarEmpregado("C");
        c.setNome("Marcelo");
        dh.addEmpregado(c);
        c = factory.criarEmpregado("R");
        dh.addEmpregado(c);

    }
}
