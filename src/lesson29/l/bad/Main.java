package lesson29.l.bad;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.accelerate();
        car.stopEngine();

        Car electricCar = new ElectricCar();
        electricCar.startEngine();
        electricCar.accelerate();
        electricCar.stopEngine();
    }
}