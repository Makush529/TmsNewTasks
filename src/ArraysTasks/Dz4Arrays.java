package ArraysTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Dz4Arrays {
    public static void main(String[] args) {
        /*Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
        массива (просто целое число). После того, как размер массива задан, заполнить его
        одним из двух способов: используя Math.random(), или каждый элемент массива вводится
        пользователем вручную. Попробовать оба варианта. После заполнения массива
        данными, решить для него следующие задачи:*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите величину массива");
        int alenght = scan.nextInt();
        int[] array = new int[alenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Значения массива: " + Arrays.toString(array));

        System.out.println("Задача 1: ");/*Задача 1:
        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.*/
        System.out.println("Прямой порядок значений массива: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] array2 = new int[array.length];
        System.out.println("Обратный порядок значений массива: ");
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - 1 - i];
            System.out.print(array2[i] + " ");
        }

        System.out.println();
        System.out.println("Задача 2: ");/*Задача 2:
        Найти минимальный-максимальный элементы и вывести в консоль.*/
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexMax = -1;
        int indexMin = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;

            }
        }
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Задача 3:");/*Задача 3:
        Найти индексы минимального и максимального элементов и вывести в консоль.*/
        System.out.println("Индекс максимального значения: " + indexMax);
        System.out.println("Индекс минимального значения: " + indexMin);


        System.out.println("Задача 4:");/*Задача 4:
        Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        сообщение, что их нет.*/
        int koll = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                koll = koll + 1;
            }
        }
        if (koll == 0) {
            System.out.println("Нулевых элеменьов в массиве нет");
        } else {
            System.out.println("Количество нулевых элементов в массиве: " + koll);
        }

        System.out.println("Задача 5:");/*Задача 5:
        Пройти по массиву и поменять местами элементы первый и последний, второй и
        предпоследний и т.д.*/

        int[] array3 = array.clone();
        int leftIndex = 0;
        int rightIndex = array3.length - 1;
        int temp;
        for (int i = 0; leftIndex < rightIndex; i++) {
            temp = array3[leftIndex];
            array3[leftIndex] = array3[rightIndex];
            array3[rightIndex] = temp;
            leftIndex = leftIndex + 1;
            rightIndex = rightIndex - 1;

        }
        System.out.println("Исходные значения массива: " + Arrays.toString(array));
        System.out.println("Значения массива после замены: " + Arrays.toString(array3));


        System.out.println("Задача 6:");/*Задача 6:
        Проверить, является ли массив возрастающей последовательностью (каждое следующее
        число больше предыдущего).*/
        System.out.println(Arrays.toString(array));
        boolean rezult = true;
        for (int i = 0; i < array.length - 1; i++) {//ArrayIndexOutOfBoundsException!!!!
            if (array[i] > array[i + 1]) {
                rezult = false;
                break;
            }
        }
        System.out.println("Массив с возрастающей последовательностью: " + rezult);
        System.out.println("Задача *:");
        scan.close();
/*Задача *:
        Имеется массив из неотрицательных чисел(любой). Представьте что массив
        представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        содержит нуля в начале, кроме самого числа 0.
        Пример:
        Input: [1,4,0,5,6,3]
        Output: [1,4,0,5,6,4]
        Input: [9,9,9]
        Output: [1,0,0,0]*/
        int[] array5 = {1, 4, 0, 5, 6, 3};
        int[] array7 = {9, 9, 9};

        myArray(array5);
        myArray(array7);
    }

    public static void myArray(int[] array6) {
        System.out.println("Исходный массив: " + Arrays.toString(array6));
        for (int i = array6.length - 1; i >= 0; i--) {
            if (array6[i] < 9) {
                array6[i]++;
                break;
            } else {
                array6[i] = 0;
            }

        }
        if (array6[0] == 0) {
            int[] newArray6 = new int[array6.length + 1];
            newArray6[0] = 1;
            array6 = newArray6;

        }
        System.out.println("Массив уведиченный на единицу: " + Arrays.toString(array6));



    }

}





