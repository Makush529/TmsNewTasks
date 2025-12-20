package lesson31.decorator;

public class KosheyDeeath implements Death{
    @Override
    public void found() {
        System.out.println("Смерть Кощея найдена!");
    }
}
