package lesson30.AbstractFactorry;

public interface AirplaneFactory {
    PassengerAirplane createPassangerAirplane();
    CargoAirplane createCargoAirplane();
}
