package lesson29.l.norm;

import lesson29.l.bad.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.accelerate();
        car.stopEngine();

        ElectricVehicle electricCar = new ElectricCar();
        electricCar.startMotor();
        electricCar.accelerate();
        electricCar.stopMotor();
    }
}
