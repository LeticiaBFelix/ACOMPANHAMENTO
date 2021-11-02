package Revisao;

import java.util.ArrayList;
import java.util.List;

public class Ex3Array {

    List<Integer> valores;
    int atual;
    int max;

    public Ex3Array(int tamanho){
        valores = new ArrayList<>(tamanho);
    }

    public boolean adicionar(int n){
            valores.add(n);
        return true;
    }

    public void calcularMedia(){
        double valor = 0;
        for (Integer v : valores){
            valor += v;
        }
        double media = valor / valores.size();
        System.out.printf("A média é %.2f", media);
    }


}
