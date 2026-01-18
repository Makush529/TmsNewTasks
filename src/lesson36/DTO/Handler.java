package lesson36.DTO;

public class Handler {
    public void firstOperation() {
        System.out.println("Старт обработчика: ");
        HouseDTO planHouse = new HouseDTO("кирпич", 3, true, "односкатная");
        BuilderServise builderServise = new BuilderServise();
        builderServise.build(planHouse);
        System.out.println("Обработчик отработал: ");
    }
}
