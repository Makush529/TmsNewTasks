package lesson30.factory;

public interface AirplaneFactory {
    Airplane createAirplane();
    public default void takeOff() {
        Airplane airplane = createAirplane();
        airplane.fly();
    }

}
