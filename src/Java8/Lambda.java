package Java8;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura");
        palavras.add("bom");
        palavras.add("cachorro");

        palavras.forEach(s -> System.out.println(s));

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(palavras);
    }
}

