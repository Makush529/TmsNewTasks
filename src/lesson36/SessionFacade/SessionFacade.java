package lesson36.SessionFacade;

import lesson8.Computer.Computer;

public class SessionFacade {
    private CarBody carBody = new CarBody();
    private Engine engine = new Engine();
    private ElectronicService electronicService = new ElectronicService();

    public void buildCar(String bodyInput, String colorInput, String engineInput, boolean electronicInput){
        carBody.body(bodyInput);
        carBody.color(colorInput);
        engine.enginePower(engineInput);
        electronicService.computer(electronicInput);
        System.out.println("Автомобиль готов!");
    }
}
