package lesson9PolimorphAndStatic.practic.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();//
        circle.draw();
        circle.erase();

        Triangle triangle= new Triangle();
        triangle.draw();
        triangle.erase();
    }

}
