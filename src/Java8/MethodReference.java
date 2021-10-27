package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura");
        palavras.add("bom");
        palavras.add("cachorro");

        palavras.forEach(System.out::println);

        palavras.sort(Comparator.comparing(String::length));
        System.out.println(palavras);
    }
}
