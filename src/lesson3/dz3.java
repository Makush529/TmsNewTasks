package lesson3;

import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        /*Задача 1:
        Напишите программу, которая будет принимать на вход число из консоли и на выход
        будет выводить сообщение четное число или нет. Для определения четности числа
        используйте операцию получения остатка от деления (операция выглядит так: '% 2').*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Задача 1: Введите число для сравнения");
        int num1 = scan.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
                /*Задача 2:
        Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
        Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».*/
        System.out.println("Задача 2: Введите температуру");
        int temp = scan.nextInt();
        if (temp < -20) {
            System.out.println("Cold");
        }
        if (-20 <= temp & temp <= -5) {
            System.out.println("Normal");
        }
        if (temp > -5) {
            System.out.println("Warm");
        }
        /*Задача 3:
        Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.*/
        int cycle = 10;
        System.out.println("Задача 3");
        while (cycle <= 20) {
            System.out.print(cycle * cycle + " ");
            cycle++;
        }
        System.out.println();
        /*Задача 4:
        Необходимо, чтоб программа выводила на экран вот такую последовательность:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.*/
        System.out.println("Задача 4");
        int cycle1 = 1;
        int num4 = 7;
        int sum = 0;
        while (sum < 98) {
            System.out.print((sum = sum + num4) + " ");
            cycle1++;
        }
        System.out.println();
        /*Задача *:

        Напишите программу, где пользователь вводит любое целое положительное число. А
        программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
        числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
        ввести некорректные данные.*/
        System.out.println("Задача 5: Введите целое положительно число");
        while (scan.hasNextInt()) {
            int num5 = scan.nextInt();
            if (num5 > 0) {
                int sum5 = 0;
                for (int i = 1; i <= num5; i++) {
                    sum5 = sum5 + i;
                }
                System.out.println("Сумма всех чисел от 1 до " + num5 + " равна " + sum5);
            } else {
                System.out.println("Введены некорректные данные");
            }
            break;
        }scan.close();


    }
}
