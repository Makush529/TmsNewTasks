package lesson30.builder;

import java.time.LocalDate;

public class MainBuilder {
    public static void main(String[] args) {
        Car oka=new Car.CarBuilder().setCarBody("хечбэк").setFuel("бензин").build();
        Car vaz2101=new Car.CarBuilder().setCarBody("Седан").setEngine("хз какой").setYearOfManufacture(LocalDate.of(1997,1,1)).build();
        System.out.println(oka);
        System.out.println(vaz2101);
    }
}
