package poo_sincrona;

public class EmpregadoFactory {
    private static EmpregadoFactory instance;

    private EmpregadoFactory(){

    }

    public static EmpregadoFactory getInstance(){
        if(instance==null)
            return instance;
        else
            return new EmpregadoFactory();
    }
}
