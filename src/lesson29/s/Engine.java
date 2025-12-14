package lesson29.s;

public class Engine {
    public void engineStart(Car car){
        System.out.println(car.getModel()+" start");
    }
    public void engineStop(Car car){
        System.out.println(car.getModel()+" stop");
    }
}