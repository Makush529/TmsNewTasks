package lesson18.Practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeTask2 {
    public static void main(String[] args) {
//        Задача 2:
//        При помощи стримов из списка строк вывести только те, которые начинаются с буквы ‘A’.
        List<String> words = new ArrayList<>();
        try (FileReader fileReader = new FileReader("src/resources/wordTest.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String Line;
            while ((Line = bufferedReader.readLine()) != null) {
                words.add(Line.trim());
            }
        } catch (Exception e) {
            System.out.println("tra-ta-ta");
            e.getMessage();
        }
        //System.out.println(words);
        words.stream()
                .filter(w -> w.startsWith("A"))
                .forEach(w -> System.out.println(w));
    }
}
