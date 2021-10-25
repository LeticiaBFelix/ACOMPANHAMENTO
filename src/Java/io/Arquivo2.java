package Java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo2 {
    public static void main(String[] args) {
        String[] lines = new String[]{"Desenvolva scripts de código em um programa no método main para:\n" +
                "• criar um arquivo no sistema operacional\n" +
                "• alterar o nome do arquivo criado\n" +
                "• criar um diretório comm o nome 'temp'\n" +
                "• criar vários arquivos dentro deste diretório recem criado\n" +
                "- mostre no console cada um dos arquivos contidos na pasta c:/\n" +
                "crie um arquivo, passe todo o conteúdo desta lista de exercícios para ele usando FileWriter\n" +
                "• mostre no console este arquivo recém criado usando FileReader\n" +
                "• mostre agora com o RandomAccesFile\n" +
                "como você faria para mostrar o conteúdo do arquivo com a classe Scanner\n" +
                "• agora que você já leu com estes mecanismos, delete o arquivo (usano a API)\n" +
                "• copie o conteúdo de uma imagem que está na sua pasta em Documents and settings/images para a pasta raiz do\n" +
                "computado"};
        File path = new File("/home/leticia-felix/Área de Trabalho/temp/exercicios.txt");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
