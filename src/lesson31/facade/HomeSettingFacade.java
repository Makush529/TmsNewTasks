package lesson31.facade;

public class HomeSettingFacade {
    private HeatingInTheHouse heatingInTheHouse;
    private LightingOfHome lightingOfHome;
    private HouseAlarm houseAlarm;

    public HomeSettingFacade() {
        heatingInTheHouse = new HeatingInTheHouse();
        lightingOfHome = new LightingOfHome();
        houseAlarm = new HouseAlarm();
    }
    public void returninHome(){
        houseAlarm.HAlarmOff();
        lightingOfHome.lightingOn();
        heatingInTheHouse.heatUp();
    }
    public void liavingHome(){
        houseAlarm.HAlarmOn();
        lightingOfHome.lightingOff();
        heatingInTheHouse.coolDown();
    }
}
