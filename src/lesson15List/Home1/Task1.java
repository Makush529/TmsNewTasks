package lesson15List.Home1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Задача 1:
        Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
        4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
        При решении использовать коллекции.*/
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String []number = string.split(", ");
        System.out.println("Массив " + Arrays.toString(number));
        HashSet<String>newNumber = new HashSet<>();
        newNumber.addAll(List.of(number));
        System.out.println("HachSet " + newNumber);
    }
}
