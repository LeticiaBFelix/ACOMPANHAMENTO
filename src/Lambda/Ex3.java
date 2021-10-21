package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {
    private List<String> list = new ArrayList<>();

    public void adicionar(String s){
        list.add(s);
    }

    public void imprimir(){
        System.out.println(list);
    }

    public void converter(){
        List<String> newList = list.stream().filter(a -> a.charAt(0) == 'a').filter(a -> a.length() == 3).collect(Collectors.toList());
        System.out.println(newList);
    }
}
