package scrierefisiere;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead2 {

    static String numeleFisierului="text.txt";
    public static void main(String[] args) {
        writeInFile(numeleFisierului, "Hello2");


    }

    public static void writeInFile(String numeleFisierului, String content){
            try {
                FileWriter fileWriter = new FileWriter(numeleFisierului);
                fileWriter.write(content);
                fileWriter.close();
                System.out.println("Am scris in fisier");
            } catch (IOException e) {
                System.out.println("error");;
            }

    }
}
