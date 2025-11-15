package lesson20.DZ;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*Задача 1:
    Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
    потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
    вычислений возвращаются в метод main()*/
    public static void main(String[] args) {
        int[] numbers = launcher();
        Thread maxThread = new Thread(new MaxThread(numbers));
        Thread minThread = new Thread(new MinThread(numbers));

        maxThread.start();
        minThread.start();
    }

    private static int[] launcher() {
        System.out.println("insert 10 elements(numbers)");
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];
        for (int i = 0; i < number.length; ) {
            try {
                number[i] = scanner.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: invalid character! Try again!");
                scanner.next();
            }
        }
        System.out.println(Arrays.toString(number));
        return number;
    }

    private static class MaxThread implements Runnable {
        private final int[] arr;

        private MaxThread(int[] arr) {
            this.arr = arr;
        }

        @Override
        public void run() {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println("Максимальное значение " + max);
        }
    }

    private static class MinThread implements Runnable {
        private final int[] arr;

        private MinThread(int[] arr) {
            this.arr = arr;
        }

        @Override
        public void run() {
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            System.out.println("Минимально значение " + min);
        }
    }
}