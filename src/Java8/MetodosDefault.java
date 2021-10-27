package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MetodosDefault {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura");
        palavras.add("bom");
        palavras.add("cachorro");

        Consumer<String> consumidor = new Imprimir();
        palavras.forEach(consumidor);

        Comparator<String> comp = new Comparador();
        palavras.sort(comp);
        System.out.println(palavras);
    }
}

    class Imprimir implements Consumer<String>{
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

    class Comparador implements Comparator<String>{
        @Override
        public int compare(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return 1;
            }
            if (s1.length() < s2.length()) {
                return -1;
            }
            return 0;
        }
    }



