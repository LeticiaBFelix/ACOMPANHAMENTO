package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    private List<Integer> list = new ArrayList<>();

    public void adicionar(int num){
        list.add(num);
    }

    public void calcularMedia(){
        double media = list.stream().reduce(0, (x, y) -> x + y) / list.size();
        System.out.printf("A média é: %.2f %n", media);
    }

}
