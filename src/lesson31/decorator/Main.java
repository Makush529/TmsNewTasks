package lesson31.decorator;

public class Main {
    public static void main(String[] args) {
        Death death = new KosheyDeeath();
        death = new EggD(death);
        death = new DuckD(death);
        death = new RabbitD(death);
        death = new SafeD(death);

        death.found();
    }
}
