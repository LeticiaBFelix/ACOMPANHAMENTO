package Java.io;

import java.io.*;

public class Arquivo3 {
    public static void main(String[] args) {
        String path = "/home/leticia-felix/Área de Trabalho/temp/exercicios.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
