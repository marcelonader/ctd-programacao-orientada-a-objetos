package guiado;

import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Jogador> listaJogadores = new ArrayList();

    public Equipe(String nome){
        this.nome = nome;
    }
    public void addJogador(Jogador jogador){
        listaJogadores.add(jogador);

    }
    public void mostrarJogadoresTitulares(){
        Collections.sort(listaJogadores);
        for(Jogador elemento: listaJogadores){
            System.out.println("Jogador: " + elemento);
        }
    }
}
