package lesson20;

public class MyThread {
    public static void main(String[] args) {
//        Задача #1: Простой вывод сообщений
//        Напишите программу, которая создаёт два потока, каждый из которых выводит сообщение в консоль. Сообщения должны чередоваться между потоками.
//         Задание: Создайте два потока, один выводит строку "Привет мир!", другой — "Доброе утро!". Пусть они выводят сообщения в произвольном порядке.
        Thread tread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет мир!");
            }
        });
        Thread tread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Доброе утро!");
            }
        });
        tread1.start();
        tread2.start();
    }
}


