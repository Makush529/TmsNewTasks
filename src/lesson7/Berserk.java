package lesson7;

public class Berserk extends Doctor{

    public Berserk() {
        super("Хирург", 1);
    }

    public void treat() {
        System.out.println("Хирург лечит ножом");
    }
}
