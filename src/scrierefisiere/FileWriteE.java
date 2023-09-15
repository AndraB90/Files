package scrierefisiere;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWriteE {
    static String numeleFisierului="text.txt";
    public static void main(String[] args) {
        readFile(numeleFisierului);

    }

    public static void readFile(String numeleFisierului){
        try {
            FileReader fileReader = new FileReader(numeleFisierului);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
