package lesson17DateTimeApi.lambda;

public class Task3Lambda {
    public static void main(String[] args) {
        IShape square =(x, y) -> x*y;
        IShape trangle = (x,y) ->x*y*0.5;

        System.out.println("площадь квадрата " + square.getSquare(5,4));
        System.out.println("площадь треугольника " + trangle.getSquare(3.4,5));
    }
}
