package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        String inicial;
        Scanner sc = new Scanner(System.in);
        Map<String, String> lista = new HashMap<String, String>();

        lista.put("A", "Ana");
        lista.put("B", "Bia");
        lista.put("W", "Wagner");
        lista.put("T", "Tadeu");
        lista.put("J", "João");

        System.out.println("Digite a inicial do nome desejado");
        inicial = sc.nextLine();
        System.out.println(lista.get(inicial));

        System.out.println("Tamanho: " + lista.size());
    }
}
