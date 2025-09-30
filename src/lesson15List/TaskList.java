package lesson15List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskList {
    public static void main(String[] args) {
        //Задача: Создайте список строк и добавьте в него несколько элементов. Затем выведите все элементы списка на консоль.
        System.out.println("List");
        List<String> listString = new ArrayList<>();
        listString.add("First string");
        listString.add("Second string");
        listString.add("tra-ta-ta");
        listString.add("First string");

        System.out.println(listString);
        for (String list : listString) {
            System.out.println(list);
        }
        //Задача: Создайте множество целых чисел и добавьте в него несколько элементов. Затем выведите все элементы множества на консоль.
        System.out.println("Set");
        Set<Integer> setInt = new HashSet<>();
        setInt.add(1);
        setInt.add(3);
        setInt.add(9);
        setInt.add(2);
        setInt.add(4);
        setInt.add(1);//не создал!!
        System.out.println(setInt);//упорядочивает хранящиеся элементы

    }

}
