package Revisao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionInterface {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(10);
        numeros.add(2);
        numeros.add(15);
        numeros.add(22);
        numeros.add(48);
        numeros.add(13);

        //Usando Consumer e Lambda
        numeros.forEach(i -> System.out.println(i));

        //Usando Supplier e Lambda
        double media = numeros.stream().collect(Collectors.averagingInt(v -> v));
        System.out.printf("Média: %.2f", media);

        //Usando Predicate e Lambda
        numeros.stream().filter(i -> i%2 == 0).forEach(i -> System.out.println("Números pares: " + i));

        //Usando Function e Lambda
        numeros.stream().map(i -> i*2).forEach(System.out::println);

        //Usando BinaryOperator e Lambda
        numeros.stream().reduce((i1, i2) -> i1 + i2).ifPresent(System.out::println);
    }
}
