package lesson16Map.practice;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
//        Задача 1:
//        1.1 Создать список: номер карты и количество денег на карте, используя HashMap.
//        1.2 Добавить к этому списку 3 записи.
//        1.3 Удалить 2 записи.
//        1.4 Вывести запись по ключу.
//        1.5 Вывести список всех ключей.
//        1.6 Вывести список всех сумм на картах.
//        1.7 Проверить, содержится ли любой элемент в коллекции.
        HashMap<Integer, Integer> cardHashMap = new HashMap<>();
        cardHashMap.put(1, 12312);
        cardHashMap.put(2, 12312);
        cardHashMap.put(3, 12312);
        cardHashMap.put(4, 12312);
        cardHashMap.put(5, 12312);
        System.out.println(cardHashMap);
        cardHashMap.remove(2);
        System.out.println(cardHashMap);
        System.out.println("все ключи коллекции: ");
        for (Integer key : cardHashMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        int sum = 0;
        for (Integer values : cardHashMap.values()) {
            sum = sum + values;
        }
        System.out.println("сумма всех средств на картах " + sum);
        System.out.println(cardHashMap.containsKey(2));

    }
}
