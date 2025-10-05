package lesson15List.Home2;

import java.util.HashSet;
import java.util.LinkedList;

public class Animal {
    //    Задача 2:
//    Создать класс, который будет хранить в себе коллекцию с названиями животных.
//    Реализовать методы удаления и добавления животных по следующим правилам:
//    добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
//    объекта этого класса в main методе другого класса.
    private LinkedList<String> animals;

    public Animal() {
        this.animals = new LinkedList<>();
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }


    public boolean deleteAnimal() {
        if (!animals.isEmpty()) {
            animals.removeLast();
            return true;
        } else {
            return false;
        }

    }

    public void printAnimal() {
        if (!animals.isEmpty()) {
            System.out.println("список животных " + animals);
        } else {
            System.out.println("список животных пуст");
        }

    }

    @Override
    public String toString() {
        return "Animal{" +
                "animals=" + animals +
                '}';
    }
}
