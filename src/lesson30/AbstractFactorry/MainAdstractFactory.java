package lesson30.AbstractFactorry;

public class MainAdstractFactory {
    public static void main(String[] args) {
        AirplaneFactory boeingFactory = new BoeingFactory();
        PassengerAirplane boeingPassenger = boeingFactory.createPassangerAirplane();
        CargoAirplane boeingCargo = boeingFactory.createCargoAirplane();
        boeingPassenger.fly();//Boing is flying
        boeingCargo.fly();//B c f

        AirplaneFactory airbusFactory = new AirbusFactory();
        PassengerAirplane airbusPassenger = airbusFactory.createPassangerAirplane();
        CargoAirplane airbusCargo = airbusFactory.createCargoAirplane();
        airbusPassenger.fly();//Airbus is flying
        airbusCargo.fly();//A c f
    }
}
