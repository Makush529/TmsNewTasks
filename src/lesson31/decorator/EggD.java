package lesson31.decorator;

public class EggD extends DecoratorDeathKoshey{
    public EggD(Death decoratorDeathKoshey) {
        super(decoratorDeathKoshey);
    }

    @Override
    public void found() {
        System.out.println("Разбили яйцо и уничтожили иглу");
        super.found();
    }
}
