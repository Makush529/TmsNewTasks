package lesson30.AbstractFactorry;

public class AirbusFactory implements AirplaneFactory{
    @Override
    public CargoAirplane createCargoAirplane() {
        return new AirbusCargoAirplane();
    }

    @Override
    public PassengerAirplane createPassangerAirplane() {
        return new AirbusPassengerAirplane();
    }
}
