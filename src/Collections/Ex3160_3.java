package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3160_3 {

    private List<String> amigos = new ArrayList<String>();

    Scanner sc = new Scanner(System.in);
    private String nome;

    public void adicionarAmigo(){
        do {
            System.out.println("Digite o nome de um amigo");
            nome = sc.nextLine();
            amigos.add(nome);
        }
        while (nome == null || !nome.equals("Não"));
    }

    public void imprimirAmigos(){
        for (int i=0; i<amigos.size(); i++){
            System.out.println(i + ": " + amigos.get(i));
        }
    }
}
