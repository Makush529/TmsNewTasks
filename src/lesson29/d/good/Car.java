package lesson29.d.good;

public class Car {
    private EngineInterface engine;

    public Car(EngineInterface engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}
