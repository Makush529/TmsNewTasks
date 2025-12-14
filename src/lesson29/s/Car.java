package lesson29.s;

public class Car {
    private String model;
    //private Doors doors;
    //private Engine engine;

    public Car(String model, Doors doors, Engine engine) {
        this.model = model;
        //this.doors = this.doors;
        //this.engine = this.engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}