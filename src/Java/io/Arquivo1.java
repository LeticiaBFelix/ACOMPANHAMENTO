package Java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo1 {
    public static void main(String[] args) {
        File f = new File("/home/leticia-felix/Área de Trabalho/temp");
        f.mkdir();

        String[] lines = new String[]{};

        File folder = new File("/home/leticia-felix/Área de Trabalho/temp");

        File f2 = new File("/home/leticia-felix/Área de Trabalho/temp/out1.txt");
        File f3 = new File("/home/leticia-felix/Área de Trabalho/temp/out2.txt");
        File f4 = new File("/home/leticia-felix/Área de Trabalho/temp/out3.txt");
        File f5 = new File("/home/leticia-felix/Área de Trabalho/temp/out4.txt");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(f5))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        File[] files = folder.listFiles(File::isFile);
        for (File file : files){
            System.out.println(file);
        }
    }
}
