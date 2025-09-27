package lesson14File;

import javax.annotation.processing.Filer;
import java.io.*;

public class main {
    public static void main(String[] args) {
        File romeo = new File("C:\\tests\\romeo-and-juliet.txt");
        String longestWord = "";
        //прочитать текст, собрать большую строку стрБ
        //преобразовать стрБ в стр
        //разрезать сплитом W,
        // найти слово,
        //создать нфайл , записать слово
        try (FileReader romeoFr = new FileReader(romeo);) {

            BufferedReader romeoBr = new BufferedReader(romeoFr);
            StringBuilder stringBuilderText = new StringBuilder();
            //char charOfText;
            String lineOfText = "";
            while (lineOfText != null) {
                lineOfText = romeoBr.readLine();
                stringBuilderText.append(lineOfText).append(" ");
            }
            String[] words = stringBuilderText.toString().split("\\W");

            for (String word : words) {
                if (longestWord.length() < word.length()) {
                    longestWord = word;
                }
            }
            File newRomeo = new File("C:\\tests\\newRomeo.txt");

            try (PrintWriter printWriter = new PrintWriter(newRomeo)) {
                System.out.println(longestWord);
                printWriter.println(longestWord);
            } catch (Exception e) {
                System.out.println("косяк1");
            }

        } catch (Exception ee) {
            System.out.println("косяк2");
        }
    }
}
