package lesson31.decorator;

public class RabbitD extends DecoratorDeathKoshey{
    public RabbitD(Death decoratorDeathKoshey) {
        super(decoratorDeathKoshey);
    }

    @Override
    public void found() {
        System.out.println("Поймали и выпотрошили зайца");
        super.found();
    }
}
