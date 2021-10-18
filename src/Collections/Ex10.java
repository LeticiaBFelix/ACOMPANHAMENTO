package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex10 {
    private List<String> itens = new ArrayList<>();

    public void adicionar(String item){
        itens.add(item);
    }

    public void embaralhar(){
        System.out.println("Antes: " + itens);
        Collections.shuffle(itens);
        System.out.println("Depois: " + itens);
    }
}
