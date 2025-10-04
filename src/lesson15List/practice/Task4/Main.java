package lesson15List.practice.Task4;

public class Main {
    public static void main(String[] args) {
//        Задача 4:
//        Создать дженерик класс Storage с полем того типа который передаем в дженерик при
//        создании объекта. Сделать конструктор по дефолту и конструктор с этим полем.
//        Добавить геттеры/сеттеры. В методе main создать 2 объекта на основе этого дженерика и
//        проверить их работу
        Storage<Integer> object1 = new Storage<>();
        Storage<Integer> object2 = new Storage<>(22);
        Storage<String> object3 = new Storage<>("qwerty");
        System.out.println(object1.toString() + " object1");
        System.out.println(object2.toString());
        System.out.println(object3);

        object1.setFiled(12);
        System.out.println(object1 + " object1new");


    }

}
