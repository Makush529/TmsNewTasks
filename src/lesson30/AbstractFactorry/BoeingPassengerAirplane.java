package lesson30.AbstractFactorry;

public class BoeingPassengerAirplane implements PassengerAirplane{
    @Override
    public void fly() {
        System.out.println("Boing is flying");
    }
}
