package lesson30.factory;

public class PassangaerAirplaneFactory implements AirplaneFactory{
    @Override
    public Airplane createAirplane() {
        return new PassangerAirplane();
    }
}
