package lesson15List.practice;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2:
//        2.1 Создать двусвязный список стран мира.
//        2.2 Добавить к этому списку 4 страны ( 2 в начало и 2 в конец), вывести результат в
//        консоль (Использовать методы addFirst/addLast).
//        2.3 Удалить по одному элементу из начала и из конца списка.
//        2.4 Получить по одному элементу из начала и из конца списка.
        LinkedList<String> country = new LinkedList<>();
        country.add("Russia");
        country.add("USA");
        country.add("Germany");
        country.add("France");
        country.add("China");
        country.add("Japan");
        System.out.println(country);
        country.addFirst("Iran");
        country.addFirst("Iraq");
        country.addLast("Cuba");
        country.addLast("Columbia");
        System.out.println(country + " добавили 2 значения в начало и в конец");
        country.removeLast();
        country.removeFirst();
        System.out.println(country + " удалили первый и последний элементы");
        System.out.println(country.getFirst() + " первый элемент");
        System.out.println(country.getLast() + " последний элемент");
    }
}
