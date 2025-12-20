package lesson31.adapter;

public class AdapterHeatingInTheHouse implements SmartDevise {
    private HeatingInTheHouse heatingInTheHouse;

    public AdapterHeatingInTheHouse(HeatingInTheHouse heatingInTheHouse) {
        this.heatingInTheHouse = heatingInTheHouse;
    }

    @Override
    public void turnOn() {
        heatingInTheHouse.heatUp();
    }

    @Override
    public void turnOff() {
        heatingInTheHouse.coolDown();

    }
}
