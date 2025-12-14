package lesson29.l.bad;

public class ElectricCar extends Car{
    @Override
    public void startEngine() {
        System.out.println("Electric motor started");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    @Override
    public void stopEngine() {
        System.out.println("Electric motor stopped");
    }
}
