package scrierefisiere;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWriteExample {
    final static String FILEPATH = "output.txt";
    final static String FILEPATH2 = "output2.txt";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Avem nevoie de path-ul file
        //Object de tip filewriter
        //methoda write (apelata)
        //inchidem filewriter prin metoda close

        /*try {
            FileWriter writer=new FileWriter(FILEPATH);
            writer.write("Hello");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error occured while accessing the file");
        }

         */

        //Scrie o metoda care cere la infinit texte user-ului si care adauga acele texte la un fisier input.txt
        //Cand utilizatorul introduce textul "gata" aplicatia se va opri

        makeTextInput();


    }

    public static void makeTextInput() {
        try {
            FileWriter fileWriter = new FileWriter(FILEPATH2);
            while (true) {
                System.out.println("Introduce some text:");
                String textInput = scan.nextLine();
                if (textInput.equals("gata")) {
                    fileWriter.close();
                    break;
                } else {
                    fileWriter.write(textInput + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("The accessing of the file shows an error");
        }

    }
}

