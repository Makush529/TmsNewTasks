package lesson11String;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        /*Задача *:
        Дана строка произвольной длины с произвольными словами. Написать программу для
        проверки является ли любое выбранное слово в строке палиндромом.
        Например, есть строка, вводится число 3, значит необходимо проверить является ли
        3-е слово в этой строке палиндромом.
        Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
        например, в строке 5 слов, а на вход программе передали число 500.*/
        String string = "Дед написала слово «шалаш»: оказалось, что оно одинаково читается слева направо и справа налево.";
        String[] strings = string.trim().split("\\s+");

        Scanner scanner = new Scanner(System.in);
        int numWord = scanner.nextInt();
        scanner.close();
        if (numWord > strings.length) {
            System.out.println("в строке" + strings.length + " , а на вход программе передали " + numWord);
        }else {
            if (isPolindrome(strings[numWord])){
                System.out.println("ok");
            }
            else {
                System.out.println("not Ok");
            }

        }

    }

    public static boolean isPolindrome(String string) {
        int firstSimbol = 0;
        int endSimbol = string.length() - 1;
        while (firstSimbol < endSimbol) {
            if (string.toLowerCase().charAt(firstSimbol) != string.toLowerCase().charAt(endSimbol)) {
                System.out.println("слово '" + string + "' не полиндром");
                return false;
            }
            endSimbol--;
            firstSimbol++;
        }
        System.out.println("слово '" + string +  "' полиндром");
        return true;

    }

}
