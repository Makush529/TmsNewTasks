package lesson31.decorator;

public class DecoratorDeathKoshey implements Death{
    private Death decoratorDeathKoshey;

    public DecoratorDeathKoshey(Death decoratorDeathKoshey) {
        this.decoratorDeathKoshey = decoratorDeathKoshey;
    }

    @Override
    public void found() {
        decoratorDeathKoshey.found();
    }
}
