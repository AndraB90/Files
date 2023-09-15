package scrierefisiere;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    final static String FILEPATH2 = "output2.txt";

    public static void main(String[] args) {

        /*try {
            FileReader fileReader = new FileReader(FILEPATH2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null) {
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Problems in accessing the file");
            ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Path-ul file-ului
        //Object de tip fileReader
        //Object de tip BufferedReader
        // O line se citeste cu metoda readLine de la BufferedReader
        //la final close la BufferedReader si close la FileReader

         */

        //Scrie o metoda care sa primeasca path-ul fisierului ca parametru si sa ii printeze continutul

        printFileContent(FILEPATH2);
        printFileContent("output.txt");


    }

    public static void printFileContent(String filepath){
        try {
            FileReader read = new FileReader(filepath);
            BufferedReader bufferedReader = new BufferedReader(read);
            String line;
            while((line= bufferedReader.readLine())!=null){
                System.out.println(line);

            }
            bufferedReader.close();
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Errors in accessing the file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
