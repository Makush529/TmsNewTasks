package lesson17DateTimeApi;

import java.util.Scanner;
import java.util.function.Function;

public class Task3 {
    //    Задача 3:
//    Используя Function реализовать лямбду, которая будет принимать в себя строку в
//    формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//    возвращать сумму, переведенную сразу в доллары.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();

        Function<String, Double> toDollars = string -> {
            String[] strings = string.split(" ");
            if (strings.length != 2) {
                throw new IllegalArgumentException("format error");
            }
            if (!strings[1].equals("BYN")) {
                throw new IllegalArgumentException("format error");
            }
            double sumMoney = Double.parseDouble(strings[0]);

            sumMoney = sumMoney / 3.39;
            return sumMoney;
        };
        System.out.println(toDollars.apply(text));
    }
}
