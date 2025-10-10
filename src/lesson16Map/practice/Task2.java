package lesson16Map.practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2:
//        Пользователь вводит строку с клавиатуры. Для каждого слова подсчитать частоту его
//        встречаемости. Слова, отличающиеся регистром букв считать разными. Использовать
//        класс HashMap. После выполнения результат вывести в консоль
        //This is a test string. This string is used for testing purposes. Testing is important.
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        HashMap<String, Integer> wordHashMap = new HashMap<>();
        String[] words = string.split("\\W+");
       // wordHashMap.clear();
        for (String oneWord : words) {
                wordHashMap.put(oneWord, wordHashMap.getOrDefault(oneWord, 0) + 1);
        }
        int num = 1;
        for (String word : wordHashMap.keySet()) {
            System.out.println(num++ +": "+ word + " " + wordHashMap.get(word));
        }
    }
}
