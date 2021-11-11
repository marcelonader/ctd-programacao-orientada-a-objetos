package aula14.mesa_de_trabalho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Porto {

    private  String nome;

    public Porto(String nome) {
        this.nome = nome;
    }

    private List<Conteiner> listaConteiners = new ArrayList<>();

    public void addConteiner(Conteiner conteiner){
        listaConteiners.add(conteiner);
    }

    public void mostrarConteiner(){
        Collections.sort(listaConteiners);
        for (Conteiner conteiner: listaConteiners){
            System.out.println("Número Conteiner: " + conteiner.getNumID());

        }
    }

    public int getConteinersPerigosos(){
        int quantPerigoso = 0;
        for (Conteiner conteiner: listaConteiners){
            if (conteiner.isPerigoso() && conteiner.getPaisOrigem().equals("Desconhecido")){
                quantPerigoso++;
            }
        }
        return  quantPerigoso;

    }

}
