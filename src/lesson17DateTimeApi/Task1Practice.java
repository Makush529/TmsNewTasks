package lesson17DateTimeApi;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1Practice {
    public static void main(String[] args) {
        /*Задача 1:
        Написать программу для вывода на консоль названия дня недели по введенной дате*/
        try {
            System.out.println("Введи дату в формате и узнаешь день недели 'yyyy.MM.dd'");
            Scanner scanner = new Scanner(System.in);
            String dateUser = scanner.nextLine();
            LocalDate localDate = LocalDate.parse(dateUser, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            DayOfWeek day = localDate.getDayOfWeek();
            System.out.println(localDate + " is " + day);
            try (FileWriter fileWriter = new FileWriter("src/resources/task17Date",true);
                 PrintWriter printWriter = new PrintWriter(fileWriter, true)) {
                printWriter.println( localDate + " is " + day);
            } catch (Exception e) {
                e.getStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Введена какая то фигня, см формат ввода " + e.getStackTrace());
        }


    }
}
