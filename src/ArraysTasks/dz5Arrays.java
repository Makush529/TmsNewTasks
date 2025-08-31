package ArraysTasks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class dz5Arrays {
    public static void main(String[] args) {
        /*Задача 1:
        1.1 Создать двумерный массив, заполнить его случайными числами.
        1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        1.3 Найти сумму всех получившихся элементов и вывести в консоль.*/
        Scanner scanner = new Scanner(System.in);
        int sizeArrayI = (int)(Math.random()*10);
        int sizeArraiJ = (int)(Math.random()*10);
        int[][] array1=new int[sizeArrayI][sizeArraiJ];
        for (int i = 0; i<sizeArrayI; i++){
            for (int j = 0; j<sizeArraiJ; j++){
                array1[i][j]=(int)(Math.random()*10);
            }
        }
        System.out.println(Arrays.deepToString(array1));
                /*Задача 2:
        Создать программу для раскраски шахматной доски с помощью цикла. Создать
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

        /*Задача *:
        Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
                Формат входных данных:
        Программа получает на вход два числа n и m.
                Формат выходных данных:
        Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
        символа*/
    }
}
