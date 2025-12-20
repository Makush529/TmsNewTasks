package lesson31.adapter;

public class AdapterLightingOfHouse implements SmartDevise {
    private LightingOfHome lightingOfHome;

    public AdapterLightingOfHouse(LightingOfHome lightingOfHome) {
        this.lightingOfHome = lightingOfHome;
    }

    @Override
    public void turnOff() {
        lightingOfHome.lightingOff();
    }

    @Override
    public void turnOn() {
        lightingOfHome.lightingOn();
    }
}
