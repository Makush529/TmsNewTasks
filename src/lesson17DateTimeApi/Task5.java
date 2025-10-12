package lesson17DateTimeApi;

import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    //    Задача 5:
//    Используя Supplier написать метод, который будет возвращать введенную с консоли
//    строку задом наперед
    public static void main(String[] args) {
        Supplier<String> reverseString = () -> {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            char[] simbols = text.toCharArray();
            char[] newSimbols = new char[simbols.length];
            for (int i = 0; i < simbols.length; i++) {
                newSimbols[simbols.length - 1 - i] = simbols[i];
            }
            simbols = newSimbols;
            String newText = new String(simbols);
            return newText;
        };
        System.out.println(reverseString.get());
    }
}
