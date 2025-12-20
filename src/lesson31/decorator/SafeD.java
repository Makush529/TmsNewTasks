package lesson31.decorator;

public class SafeD extends DecoratorDeathKoshey{
    public SafeD(Death decoratorDeathKoshey) {
        super(decoratorDeathKoshey);
    }

    @Override
    public void found() {
        System.out.println("Открыли ящик Кощея");
        super.found();
    }
}
