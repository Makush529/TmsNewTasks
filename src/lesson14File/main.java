package lesson14File;

import javax.annotation.processing.Filer;
import java.io.*;

public class main {
    public static void main(String[] args) {
        File romeo = new File("C:\\myProgect\\romeo-and-juliet.txt");
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
            String lineOfText = romeoBr.readLine();
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
            File newRomeo = new File("C:\\myProgect\\newRomeo.txt");
            try {
                FileWriter fileWriter = new FileWriter(newRomeo);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                System.out.println(longestWord);
                printWriter.println(longestWord);

            } catch (Exception e) {
            }

        }catch (Exception ee){}
    }
}
