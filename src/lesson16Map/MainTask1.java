package lesson16Map;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class MainTask1 {
    public static void main(String[] args) {
        String[] strings1 = {"a", "b", "a", "c", "b"};
        String[] strings2 = {"c", "b", "a"};
        String[] strings3 = {"c", "c", "c", "c"};

        System.out.println(hashMap(strings1));
        System.out.println(hashMap(strings2));
        System.out.println(hashMap(strings3));

        String filePath = "src/resources/result16.txt";

        writeToFile(hashMap(strings1),filePath);

    }

    public static HashMap<String, Boolean> hashMap(String[] array) {
        HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
        HashMap<String, Boolean> hashMap2 = new HashMap<String, Boolean>();
        for (String str : array) {
            hashMap1.put(str, hashMap1.getOrDefault(str, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
            hashMap2.put(entry.getKey(), entry.getValue() >= 2);
        }
        return hashMap2;
    }
    public static void writeToFile(HashMap<String, Boolean> map, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            // Запись содержимого HashMap в файл
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("Результат добавлен в файл: " + filePath);
        } catch (Exception e) {
            System.out.println("vse.....");;
        }
    }
}

