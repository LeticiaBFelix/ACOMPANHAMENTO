package Revisao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JavaIo {
    public static void main(String[] args) {

        List<Produto> total = new ArrayList<>();
        File path2 = new File("/home/leticia-felix/Área de Trabalho/Teste/produtos.csv");
        File path3 = new File("/home/leticia-felix/Área de Trabalho/Teste/out/summary.csv");

        try(BufferedReader br = new BufferedReader(new FileReader(path2))){
            String itemCsv = br.readLine();

            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);

                total.add(new Produto(nome, preco, quantidade));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path3))) {

                for (Produto item : total) {
                    bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(path3 + " CREATED!");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
}
