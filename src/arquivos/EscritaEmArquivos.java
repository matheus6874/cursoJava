package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaEmArquivos {
    public static void main(String[] args) {
        String[] lines = new String[] {"Bom dia","Boa tarde","Boa noite"};
        String path = "C:\\Users\\matheus.cristino\\Desktop\\Teste2.txt";
        //sem o parametro true é criado um novo arquivo sempre
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
