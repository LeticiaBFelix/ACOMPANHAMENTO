package Collections;

import java.util.ArrayList;
import java.util.List;

public class Ex7 {

    List<Integer> elementos = new ArrayList<>();

    public void adicionar(int elemento){
        elementos.add(elemento);
    }

    public void pesquisar(int index){
        if(index > elementos.size()){
            throw new NullPointerException("Indice não existe na lista");
        }
        else{
            System.out.println("O elemento no indice " + index + " é " + elementos.get(index));
        }
    }
}
