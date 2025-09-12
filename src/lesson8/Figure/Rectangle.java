package lesson8.Figure;

public class Rectangle extends Figure {
    private final String name = "Прямоугольник";
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double perimetrOfFigure() {
        double perimetr = (side1 + side2) * 2;
        return perimetr;
    }

    @Override
    double areaOfFigure() {
        double area = side1 * side2;
        return area;
    }

    @Override
    String getNameOfFigure() {
        return name;
    }
}
