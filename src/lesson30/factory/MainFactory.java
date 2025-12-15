package lesson30.factory;

public class MainFactory {
    public static void main(String[] args) {
       AirplaneFactory SU100= new PassangaerAirplaneFactory();
       SU100.takeOff();
       AirplaneFactory SU200=new CaegoAirplaneFactory();
       SU200.takeOff();
    }
}
