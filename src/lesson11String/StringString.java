package lesson11String;

import java.util.HashSet;
import java.util.Scanner;

public class StringString {
    public static void main(String[] args) {
        /*1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
        найденные строки и их длину.
        2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
        значений их длины.
        3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
        средней, а также их длину.
        4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
        Если таких слов несколько, найти первое из них.
        5. Вывести на консоль новую строку, которой задублирована каждая буква из
        начальной строки. Например, "Hello"-> "HHeelllloo".*/

        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();
        scanner.close();


        int stringShort = Integer.MAX_VALUE;
        int stringLong = 0;
        int indexStringShort = 0;
        int indexStringLong = 0;

        String[] strings = new String[3];
        strings[0] = string1;
        strings[1] = string2;
        strings[2] = string3;

        for (int i = 0; i <= 2; i++) {
            if (stringShort >= strings[i].length()) {
                stringShort = strings[i].length();
                indexStringShort = i;
            }
            if (stringLong <= strings[i].length()) {
                stringLong = strings[i].length();
                indexStringLong = i;
            }
        }
        System.out.println("1. Сравнение длинны: ");
        System.out.println(strings[indexStringLong] + " символов: " + stringLong + "\n"
                + strings[indexStringShort] + " символов: " + stringShort);

        System.out.println("2. Вывод по возрастанию количества символов: ");
        //Arrays.sort(strings);//не подойдет
        //System.out.println(Arrays.toString(strings));
        //компаратор???
        //перестановка
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        //для 3 задания
        int sumSimbol = 0;
        for (String stringOut : strings) {
            System.out.println(stringOut + " " + stringOut.length());
            sumSimbol = sumSimbol + stringOut.length();
        }

        System.out.println("3. Вывести на консоль те строки, длина которых меньше средней, а также их длину");
        int average = sumSimbol / strings.length;
        System.out.println("средняя длина строк равна: " + average);

        for (String string : strings) {
            if (string.length() < average) {
                System.out.println(string + " " + string.length());
            }
        }
        System.out.println("4. Найти слово, состоящее только из различных символов. " +
                "Если таких слов несколько, найти первое из них. ");

        ochco:
        for (String string : strings) {
            String[] words = string.trim().split("\\s+");
            for (String word : words) {
                HashSet<Character> uniqSim = new HashSet<>();
                for (char ch : word.toCharArray()) {
                    if (!uniqSim.add(ch)) {
                    }
                }
                System.out.println("первое слово с уникальными символами: " + word);
                break ochco;


            }
        }
    }
}