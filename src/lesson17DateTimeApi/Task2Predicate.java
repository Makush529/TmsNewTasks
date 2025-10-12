package lesson17DateTimeApi;

import java.util.function.Predicate;

public class Task2Predicate {
    public static void main(String[] args) {
//        Задача 2:
//        Используя Predicate среди массива чисел вывести только те, которые являются
//        положительными
        Integer[]number = {1,2,4,9,5,-4,3,-4,-9};
        Predicate<Integer>positive = x->x>0;
        for (int num: number){
            System.out.printf("%3d : %b\n",num, positive.test(num));
        }
    }
}
