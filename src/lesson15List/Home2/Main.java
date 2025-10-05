package lesson15List.Home2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Animal animals = new Animal();

        animals.addAnimal("cat");
        animals.addAnimal("dog");
        animals.addAnimal("tiger");
        animals.addAnimal("elephant");

        animals.printAnimal();

        animals.deleteAnimal();
        animals.printAnimal();
        animals.deleteAnimal();
        animals.deleteAnimal();
        animals.deleteAnimal();
        animals.printAnimal();

    }
}
