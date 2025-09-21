package lesson12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        /*Задача 1:
        Вывести в консоль из строки которую пользователь вводит с клавиатуры все
        аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
        только из прописных букв, без чисел.*/
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String regexAbr = "([A-ZА-Я]{2,6})[а]?";
        Pattern pattern = Pattern.compile(regexAbr);
        Matcher matcher = pattern.matcher(string);


        boolean rezult = false;
        while (matcher.find()) {
            System.out.println("Аббривеатуры с троке: " + matcher.group(1));
            rezult = true;
        }
        if (!rezult) {
            System.out.println("ничего не найдено");
        }
    }
}
/*
Освобождение наружного ШРУСа из ступицы: полностью открутить ступичную гайку,
вынуть шлицевую часть привода из ступицы. Обычно невозможно освободить ШРУС без снятия всего привода,
но можно открутить шаровую опору и монтажкой снять ступицу с нижнего рычага,
чтобы получить больше свободы для выведения вала.*/
