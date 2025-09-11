package lesson9PolimorphAndStatic.practic.Person;

/*Задача 2:
Создать класс Person. Написать статическое финальное поле name и статический метод,
который выводит его имя в консоль. Реализовать в методе main другого класса вызов
поля и метода не создавая объекта класса Person.*/
public class Main {
    public static void main(String[] args) {
        System.out.println(Person.name);
        Person.printName();
    }
}
