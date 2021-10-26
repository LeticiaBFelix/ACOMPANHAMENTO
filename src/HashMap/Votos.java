package HashMap;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Votos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votacao = new HashMap<>();

        System.out.print("Informe o caminho do arquivo: ");
        String path = sc.nextLine();
        //Caminho: /home/leticia-felix/Área de Trabalho/Teste/out.csv

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line!=null){

                String[] campos = line.split(",");

                String nomes = campos[0];
                Integer votos = Integer.parseInt(campos[1]);

                if(votacao.get(nomes)==null){
                votacao.put(nomes, votos);
                }else{
                    votacao.put(nomes, votos + votacao.get(nomes));
                }

                line = br.readLine();
            }

            for (String key : votacao.keySet()){
                System.out.println(key + ": " + votacao.get(key));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        sc.close();
    }
}
