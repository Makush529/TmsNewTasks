package lesson31.adapter;

public class MainSmartDevise {
    public static void main(String[] args) {
        HeatingInTheHouse heatingInTheHouse = new HeatingInTheHouse();
        LightingOfHome lightingOfHome = new LightingOfHome();
        SmartDevise adapterHeatingInTheHouse = new AdapterHeatingInTheHouse(heatingInTheHouse);
        SmartDevise adapterLightingOfHouse = new AdapterLightingOfHouse(lightingOfHome);

        adapterHeatingInTheHouse.turnOn();
        adapterLightingOfHouse.turnOn();
        adapterLightingOfHouse.turnOff();
        adapterHeatingInTheHouse.turnOff();
    }
}
