package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {

    private List<String> list = new ArrayList<>();

    public void adicionar(String s){
        list.add(s);
    }

    public void imprimir(){
        System.out.println(list);
    }

    public void converter(){
        List<String> conv = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(conv);
    }
}
