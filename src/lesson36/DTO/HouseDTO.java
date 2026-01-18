package lesson36.DTO;

public class HouseDTO {
    private String wallMaterial;
    private int floors;
    private boolean hasGarage;
    private String roofType;

    public HouseDTO(String wallMaterial, int floors, boolean hasGarage, String roofType) {
        this.wallMaterial = wallMaterial;
        this.floors = floors;
        this.hasGarage = hasGarage;
        this.roofType = roofType;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public int getFloors() {
        return floors;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public String getRoofType() {
        return roofType;
    }

    @Override
    public String toString() {
        return "HouseDTO{" +
                "Материал стен: '" + wallMaterial + '\'' +
                ", Количество этажей: " + floors +
                ", Гараж: " + (hasGarage? "да" : "нет") +
                ", Тип крыши: '" + roofType + '\'' +
                '}';
    }
}
