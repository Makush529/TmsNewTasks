package lesson30.AbstractFactorry;

public class BoeingFactory implements AirplaneFactory{
    @Override
    public CargoAirplane createCargoAirplane() {
        return new BoeingCargoAirplane() ;
    }

    @Override
    public PassengerAirplane createPassangerAirplane() {
        return new BoeingPassengerAirplane();
    }
}
