package lesson20;

import java.util.Random;

public class MyThread3 {
    //    Задача #3: Задержка в потоке
//    Создайте программу, которая запускает два потока, каждый из которых выводит строку с небольшой задержкой.
//    Задание: напишите два потока, которые выводят "Поток A" и "Поток B",
//    но каждый из них ждет случайное время перед выводом (например, от 1 до 3 секунд).
//    Идея: знакомство с функцией Thread.sleep() для организации паузы в исполнении потока.
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                randomSleeps();
                System.out.println("Поток А");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                randomSleeps();
                System.out.println("Поток В");
            }
        });
        thread1.start();
        thread2.start();

    }

    private static void randomSleeps() {
        Random random = new Random();
        int sec = random.nextInt(4);//0-3!!!
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }
    }
}
