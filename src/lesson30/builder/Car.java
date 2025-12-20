package lesson30.builder;

import java.time.LocalDate;

public class Car {
    private String engine;
    private String carBody;
    private LocalDate yearOfManufacture;
    private String fuel;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public LocalDate getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(LocalDate yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", carBody='" + carBody + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", fuel='" + fuel + '\'' +
                '}';
    }

    public static class CarBuilder {
        private Car car;

        public CarBuilder() {
            car=new Car();
        }
        public CarBuilder setEngine(String engine){
            car.setEngine(engine);
            return this;
        }
        public  CarBuilder setCarBody(String carBody){
            car.setCarBody(carBody);
            return this;
        }
        public CarBuilder setYearOfManufacture(LocalDate yearOfManufacture){
            car.setYearOfManufacture(yearOfManufacture);
            return this;
        }
        public CarBuilder setFuel(String fuel){
            car.setFuel(fuel);
            return this;
        }
        public Car build(){
            return car;
        }
    }
}
