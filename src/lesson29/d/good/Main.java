package lesson29.d.good;

public class Main {
    public static void main(String[] args) {
        EngineInterface engine = new Engine();
        Car car = new Car(engine);
        car.start();
    }
}