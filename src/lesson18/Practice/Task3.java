package lesson18.Practice;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    //    Задача 3:
//    При помощи стримов из списка, содержащего объекты Developer, вывести только те, id >
//            10 и name начинается с ‘An’
    public static void main(String[] args) {
        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer(1, "Lex"));
        developers.add(new Developer(20, "Don"));
        developers.add(new Developer(3, "John"));
        developers.add(new Developer(40, "Anex"));
        developers.add(new Developer(15, "Anlex"));

        developers.stream()
                .filter(d -> d.getId() > 10 && d.getName().startsWith("An"))
                .forEach(u->System.out.println(u));
    }
}
