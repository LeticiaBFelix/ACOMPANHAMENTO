package Java.io;

import java.io.*;

public class Arquivo {
    public static void main(String[] args) {

        String[] lines = new String[]{};
        File path = new File("/home/leticia-felix/Área de Trabalho/Teste/out.txt");
        File path2 = new File("/home/leticia-felix/Área de Trabalho/Teste/out2.txt");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        boolean success = path.renameTo(path2);

}
}

