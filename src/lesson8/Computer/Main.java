package lesson8.Computer;
/*Задача 2:
Создать абстрактный класс Computer и абстрактный метод getClassName(). Создать
классы Hp и Mac и отнаследоваться от Computer. Переопределить метод getClassName()
в классах-наследниках так, чтобы они выводили сообщения «I’m HP» или «I’m Mac». В
методе main класса Main создать объекты классов Hp Mac и вызвать методы для каждого
из этих объектов*/
public class Main {
    public static void main(String[] args) {
        HP hp = new HP();
        Mac mac = new Mac();

        System.out.println(hp.getClassName());
        System.out.println(mac.getClassName());

    }



}
