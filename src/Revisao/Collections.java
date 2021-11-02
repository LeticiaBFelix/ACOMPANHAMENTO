package Revisao;

import java.util.Scanner;

public class Collections{
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        Integer tamanho;
        int valor;

        System.out.println("Digite o tamanho da lista");
        tamanho = sr.nextInt();

        Ex3Array ex1 = new Ex3Array(tamanho);

        if (tamanho!=null){
            for (int i=0; i<tamanho; i++){
                System.out.println("Digite um valor");
                valor = sr.nextInt();
                ex1.adicionar(valor);
            }
        } else{
            System.out.println("A lista não possui espaço");
        }

        ex1.calcularMedia();
    }

}
