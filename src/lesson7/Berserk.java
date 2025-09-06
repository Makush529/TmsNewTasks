package lesson7;

public class Berserk extends Doctor{

    public Berserk() {
        super("Хирург", 1);
    }

    public void treat(Patient patient) {
        System.out.println("Хирург лечит ножом");
    }
}
