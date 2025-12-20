package lesson30.prototype;

public class Car implements Prototype {
    private String model;
    private String bodyCar;

    public Car(String model, String bodyCar) {
        this.model = model;
        this.bodyCar = bodyCar;
    }

    @Override
    public Prototype clone() {
        return new Car(model, bodyCar);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyCar() {
        return bodyCar;
    }

    public void setBodyCar(String bodyCar) {
        this.bodyCar = bodyCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", bodyCar='" + bodyCar + '\'' +
                '}';
    }
}

