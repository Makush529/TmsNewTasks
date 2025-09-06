package lesson7;

public class Dantist extends Doctor {
    public Dantist() {
        super("Дантист", 2);
    }

    public void treat() {
        System.out.println("Дантист сверлит зубы");
    }
}
