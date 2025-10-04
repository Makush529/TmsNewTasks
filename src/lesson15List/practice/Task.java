package lesson15List.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Task {
    public static void main(String[] args) {
//        Задача 1:
//        1.1 Создать коллекцию ArrayList стран мира.
//        1.2 Добавить к этому cписку 3 страны, вывести результат в консоль.
//        1.3 Заменить 2-й элемент.
//        1.4 Удалить его по индексу.
//        1.5 Удалить любой элемент по значению.
//        1.6 Узнать индекс любого элемента.
//        1.7 Проверить, содержится ли элемент в коллекции (любой).
        ArrayList<String> country = new ArrayList<>();
        country.add("Russia");
        country.add("USA");
        country.add("Germany");
        country.add("France");
        country.add("China");
        country.add("Japan");
        System.out.println(country);
        country.set(1, "Spain");
        System.out.println(country + " замена значения по индексу");
        country.remove(1);
        System.out.println(country + " удалили по индексу");
        country.remove("Japan");
        System.out.println(country + " удалили по значению");
        int index = country.indexOf("Russia");
        System.out.println(index + " вывод индекса по значению");
        boolean result = country.contains("Germany");
        System.out.println(result + " проверка содержится ли значение в массиве");
        String[]countryArray = country.toArray(new String[country.size()]);
        System.out.println(Arrays.toString(countryArray));

    }
}
