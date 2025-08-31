package ArraysTasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class dz5Arrays {
    public static void main(String[] args) {
        System.out.println("Задача 1.1:");/*Задача 1:
        1.1 Создать двумерный массив, заполнить его случайными числами.
        1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        1.3 Найти сумму всех получившихся элементов и вывести в консоль.*/
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sizeArrayI = random.nextInt(1, 5);
        int sizeArraiJ = random.nextInt(1, 5);
        int[][] array1 = new int[sizeArrayI][sizeArraiJ];
        for (int i = 0; i < sizeArrayI; i++) {
            for (int j = 0; j < sizeArraiJ; j++) {
                array1[i][j] = random.nextInt(0, 10);
            }
        }
        System.out.println("Исходный массив:" + Arrays.deepToString(array1));
        System.out.println("Задача 1.2: ");
        System.out.println("Введите число для добавления к каждому значению: ");
        int myNum = scanner.nextInt();
        int sumElement = 0;
        for (int i = 0; i < sizeArrayI; i++) {
            for (int j = 0; j < sizeArraiJ; j++) {
                array1[i][j] = array1[i][j] + myNum;
                //System.out.print(array1[i][j] + " ");
                sumElement = sumElement + array1[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array1));
        System.out.println("Задача 1.3:");
        System.out.println("Сумма всех значений элементов: " + sumElement);


        System.out.println("Задача 2:");
        /*Создать программу для раскраски шахматной доски с помощью цикла. Создать
        двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        B(Black) или W(White). При выводе результат работы программы должен быть
        следующим:
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W*/
        String[][] chess = new String[8][8];

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" W ");
                } else {
                    System.out.print(" B ");
                }

            }
            System.out.println();
        }


        System.out.println("Задача*():");/*Задача *:*/
        System.out.println("Введите количество строк");
        int sizeI = scanner.nextInt();
        System.out.println("Введите количество столбцов");
        int sizeJ = scanner.nextInt();
        int[][] snake = new int[sizeI][sizeJ];
        int firstNumber = 0;
        for (int i = 0; i < sizeI; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < sizeJ; j++) {
                    snake[i][j] = firstNumber++;
                }
            } else {
                for (int j = sizeJ - 1; j >= 0; j--) {
                    snake[i][j] = firstNumber++;
                }
            }
        }
        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                System.out.printf("%3d", snake[i][j]);
            }
            System.out.println();
        }
        scanner.close();
        /*Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
                Формат входных данных:
        Программа получает на вход два числа n и m.
                Формат выходных данных:
        Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
        символа*/
    }
}
