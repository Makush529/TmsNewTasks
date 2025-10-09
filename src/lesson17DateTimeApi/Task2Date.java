package lesson17DateTimeApi;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task2Date {
    public static void main(String[] args) {
//        Задача 2:
//        Написать программу для вывода на экран дату следующего вторника.
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayNow = localDate.getDayOfWeek();
        DayOfWeek day = DayOfWeek.THURSDAY;
        while (day != dayNow) {
            localDate = localDate.plusDays(1);
            dayNow = localDate.getDayOfWeek();
        }
        System.out.println(localDate + " " + localDate.getDayOfWeek());
    }
}
