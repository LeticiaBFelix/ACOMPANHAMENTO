package Collections;

import java.util.ArrayList;
import java.util.List;

public class Ex6 {

    private List<Integer> numeros = new ArrayList();

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void imprimir(){
        for (int numero: numeros) {
            System.out.println(numero);
        }
    }

    public void adicionar(Integer num){
        getNumeros().add(num);
    }

    public void removeTerceiroNum(){
        if(numeros.size()>3){
        System.out.println("Antes de remover: " + getNumeros());
        getNumeros().remove(3);
        System.out.println("Depois de remover: " + getNumeros());}
        else{
            throw new NullPointerException("A lista não possui o terceiro elemento");
        }
    }
}
