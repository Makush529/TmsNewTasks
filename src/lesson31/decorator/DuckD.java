package lesson31.decorator;

public class DuckD extends DecoratorDeathKoshey{
    public DuckD(Death decoratorDeathKoshey) {
        super(decoratorDeathKoshey);
    }

    @Override
    public void found() {
        System.out.println("Поймали и вскрыли утку");
        super.found();
    }
}
