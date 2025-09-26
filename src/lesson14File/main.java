package lesson14File;

import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        File romeo = new File("C:\\myProgect\\romeo-and-juliet.txt");
        String longestWord = "";
        //прочитать текст
        //найти слово
        //создать нфайл , записать слово
        try (FileReader romeoFr = new FileReader(romeo);){

            BufferedReader romeoBr = new BufferedReader(romeoFr);
            //char charOfText;
            String lineOfText;
        } catch (IOException e){};
    }
}
