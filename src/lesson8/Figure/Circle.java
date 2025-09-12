package lesson8.Figure;

public class Circle extends Figure {
    private final String name = "Круг";
    private double diametr;

    public Circle(int diametr) {
        this.diametr = diametr;
    }

    @Override
    double areaOfFigure() {
        double radius = diametr / 2;
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    double perimetrOfFigure() {
        double perimetr = diametr * Math.PI;
        return perimetr;
    }

    @Override
    String getNameOfFigure() {
        return name;
    }
}
