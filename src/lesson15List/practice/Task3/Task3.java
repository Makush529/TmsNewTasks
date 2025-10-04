package lesson15List.practice.Task3;

import java.util.Arrays;
import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
//        Задача 3:
//        3.1 Создать класс Person.
//        3.2 Создать HashSet в классе Main.
//        3.3 Добавить к этому списку 3 объекта Person, вывести результат используя for each.
//        3.4 Удалить 2 объекта из коллекции.
//        3.5 Проверить, содержится ли оставшийся объект в коллекции
        HashSet<Person>persons = new HashSet<>();
        persons.add(new Person("John",18));
        persons.add(new Person("Tony",40));
        persons.add(new Person("Fil",20));
        System.out.println(persons);
        Person delete = new Person("John", 18);
        boolean result = persons.remove(delete);
        System.out.println(result);
        System.out.println(persons);

    }
}
