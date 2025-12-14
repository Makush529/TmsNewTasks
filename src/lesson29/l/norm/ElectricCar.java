package lesson29.l.norm;

public class ElectricCar implements ElectricVehicle{
    @Override
    public void startMotor() {
        System.out.println("Electric motor started");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    @Override
    public void stopMotor() {
        System.out.println("Electric motor stopped");
    }
}
