package Revisao;

import java.util.Map;
import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {
        String pais;
        Scanner sr = new Scanner(System.in);

        Map<String, String> linguas = new java.util.HashMap<>();
        linguas.put("brasil", "Feliz Natal");
        linguas.put("alemanha", "Frohliche Weihnachten!");
        linguas.put("austria", "Frohe Weihnacht!");
        linguas.put("coreia", "Chuk Sung Tan!");
        linguas.put("espanha", "Feliz Navidad!");
        linguas.put("grecia", "Kala Christougena!");
        linguas.put("estados-unidos", "Merry Christmas!");
        linguas.put("inglaterra", "Merry Christmas!");
        linguas.put("australia", "Merry Christmas!");
        linguas.put("portugal", "Feliz Natal!");
        linguas.put("suecia", "God Jul!");
        linguas.put("turquia", "Mutlu Noeller");
        linguas.put("argentina", "Feliz Navidad!");
        linguas.put("chile", "Feliz Navidad!");
        linguas.put("mexico", "Feliz Navidad!");
        linguas.put("antardida", "Merry Christmas!");
        linguas.put("canada", "Merry Christmas!");
        linguas.put("irlanda", "Nollaig Shona Dhuit!");
        linguas.put("belgica", "Zalig Kerstfeest!");
        linguas.put("italia", "Buon Natale!");
        linguas.put("libia", "Buon Natale!");
        linguas.put("siria", "Milad Mubarak!");
        linguas.put("marrocos", "Milad Mubarak!");
        linguas.put("japao", "Merii Kurisumasu!");

        System.out.println("Qual pais deseja pesquisar?");
        pais = sr.nextLine();

        if(linguas.containsKey(pais)){
            System.out.println(linguas.get(pais));
        }else{
            System.out.println("--- NOT FOUND ---");
        }
    }
}
