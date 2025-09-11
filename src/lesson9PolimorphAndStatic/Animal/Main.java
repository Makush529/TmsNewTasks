package lesson9PolimorphAndStatic.Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        dog.voice();
        dog.eat("Meat");
        dog.eat("Soap");
        System.out.println();
        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Grass");
        System.out.println();
        rabbit.voice();
        rabbit.eat("Grass");
        rabbit.eat("Meat");
        rabbit.eat("Car");
        System.out.println();

        Cat cat = Cat.NewCat.methodNewCat();//static NewCat!!!!!!!!!!!
        cat.voice();
        cat.eat("Meat");

    }
}
