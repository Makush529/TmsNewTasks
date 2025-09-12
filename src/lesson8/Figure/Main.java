package lesson8.Figure;

/*Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
периметра всех фигур в массиве.*/
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(12);

        Figure[] figures = new Figure[5];
        figures[0] = new Circle(12);
        figures[1] = new Trangle(21, 12, 22);
        figures[2] = new Rectangle(43, 54);
        figures[3] = new Rectangle(33, 28);
        figures[4] = new Circle(29);
        double summOfPerimetr = 0;
        for (int i = 0; i < figures.length; i++) {
            summOfPerimetr += figures[i].perimetrOfFigure();
            System.out.printf("Периметр фигуры '%s': равен %.2f\n", figures[i].getNameOfFigure(), figures[i].perimetrOfFigure());
        }
        System.out.printf("Сумма всех периметров фигур равна %.2f \n\n", summOfPerimetr);
        System.out.println();
        System.out.printf("Площадь фигуры '%s' вне массива равна %.2f\n", circle.getNameOfFigure(),circle.areaOfFigure());
    }

}
