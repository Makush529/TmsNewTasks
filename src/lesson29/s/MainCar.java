package lesson29.s;

public class MainCar {
    public static void main(String[] args) {
        Doors doors=new Doors();
        Engine engine= new Engine();
        Car car1 = new Car("lada2106", doors,engine);

        engine.engineStart(car1);
        doors.doorsOpen(car1);
    }
}
