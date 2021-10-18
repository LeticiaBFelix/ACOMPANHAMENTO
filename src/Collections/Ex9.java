package Collections;

import java.util.ArrayList;
import java.util.List;

public class Ex9 {

    List<String> nomes = new ArrayList<>();
    private List<String> nomesCopias = nomes;

    public void adicionar(String nome){
        nomes.add(nome);
    }

    public void imprimir(){
        System.out.println("Nomes originais: " + nomes);
        System.out.println("Nomes copias: " + nomesCopias);
    }
}
