package lesson9PolimorphAndStatic.practic.Shape;

/*Задача 1:
Реализовать иерархию, показанную ниже, переопределить методы draw и erase в каждом
из классов так, чтобы он выводил “I draw ”+ имя класса и “I erase ” + имя класса. Показать
работу каждого из методов в main другого класса*/
abstract class Shape {
    public abstract void draw();

    public abstract void erase();
}





