package lesson18;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;

public class Task1 {
    //    Задача 1:
//    Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
//    Stream'ов:
//- Удалить дубликаты
//- Оставить только четные элементы
//- Вывести сумму оставшихся элементов в стриме
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            number.add((int) (Math.random() * 100) + 1);
        }
        System.out.println(number);
        int sum=number.stream()
                .distinct()
                .filter(n->n%2==0)
                .mapToInt(n->n.intValue())
                .sum();
        System.out.println(sum);
    }
}
