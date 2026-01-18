package lesson36.DTO;

public class BuilderServise {
    public void build (HouseDTO planHouse){
        System.out.println("Начало стройки!");
        System.out.println("Строительство стен из " + planHouse.getWallMaterial());
        System.out.println("Строительство этажей в количестве " +planHouse.getFloors());
        System.out.println("Гараж имеется: " + planHouse.isHasGarage());
        System.out.println("Тип крыши " + planHouse.getRoofType());
        System.out.println("Стройка закончена!");
    }
}
