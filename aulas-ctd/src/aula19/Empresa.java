package aula19;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String cnpj;
    private List<Empregado> listaEmpregados = new ArrayList<>();

    public Empresa(String cnpj) {

        this.cnpj = cnpj;
    }


    public Empregado addEmpregado(Empregado empregado){

        listaEmpregados.add(empregado);
        return empregado;
    }

    public Double calcularSalarioTotal(){
        double salarioTotal = 0.0;
        for(Empregado empregado : listaEmpregados){
            salarioTotal += empregado.calcularSalario();
        }
        return salarioTotal;
    }

}