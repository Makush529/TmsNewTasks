package lesson17DateTimeApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1Date {
    public static void main(String[] args) {
//        Задача 1:
//        Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
//        когда пользователю исполнится 100 лет. Использовать Date/Time API.
        Scanner scanner = new Scanner(System.in);
        System.out.println("ввести дату рождения в формате yyyy.MM.dd");
        String birthday =scanner.nextLine();
        LocalDate localDateBirthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        LocalDate nowDate = LocalDate.now();
        LocalDate year100plus = localDateBirthday.plusYears(100);
        System.out.println(year100plus);

    }
}
