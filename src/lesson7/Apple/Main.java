package lesson7.Apple;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Apple apple = new Apple();
        System.out.println(apple.getColor());

        Field field = Apple.class.getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple, "blue");

        System.out.println(apple.getColor());
    }
}
