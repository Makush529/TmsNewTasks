package lesson29.i.norm;

public class Car implements CivilianCar {
    @Override
    public void engine() {
        System.out.println("двигатель работает");
    }

    @Override
    public void brake() {
        System.out.println("тачка тормозит");
    }
}
