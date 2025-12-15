package lesson30.factory;

public class CaegoAirplaneFactory implements AirplaneFactory {
    @Override
    public Airplane createAirplane() {
        return new CargoAirplane();
    }
}
