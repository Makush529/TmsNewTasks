package lesson30.prototype;

import lesson30.prototype.Car;

public class MainPrototype {
    public static void main(String[] args) {
        Car sportCar=new Car("VGGH","Sedan");
        Car newCar = (Car) sportCar.clone();

        System.out.println(sportCar);
        System.out.println(newCar);

        newCar.setBodyCar("T-34");
        System.out.println(newCar);
    }
}
