package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11 {
    private List<String> itens = new ArrayList<>();

    public void adicionar(String item){
        itens.add(item);
    }

    public void inverter(){
        System.out.println("Antes: " + itens);
        Collections.reverse(itens);
        System.out.println("Depois: " + itens);
    }
}
