package lesson17DateTimeApi;

import java.util.Scanner;
import java.util.function.Consumer;

public class Task4Concumer {
    //    Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
//    формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//    выводить сумму, переведенную сразу в доллары
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Consumer<String> toDollar = string -> {
            String[] strings = string.split(" ");
            if (strings.length != 2) {
                throw new IllegalArgumentException("format error");
            }
            if (!strings[1].equals("BYN")) {
                throw new IllegalArgumentException("format error");
            }
            double result = (Double.parseDouble(strings[0])) / 3.39;
            System.out.println(result);
        };
        toDollar.accept(text);
    }
}
