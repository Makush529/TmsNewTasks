package lesson8.Figure;

public class Trangle extends Figure {
    private String name = "Треугольник";
    private double side1;
    private double side2;
    private double side3;


    public Trangle(double side1, double side2, double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double areaOfFigure() {
        double poluPerimetr = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(poluPerimetr * (poluPerimetr - side1) * (poluPerimetr - side2) * (poluPerimetr - side3));
        return area;
    }

    @Override
    double perimetrOfFigure() {
        double perimetr = side1 + side2 + side3;
        return perimetr;
    }

    @Override
    String getNameOfFigure() {
        return name;
    }
}
