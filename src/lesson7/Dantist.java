package lesson7;

public class Dantist extends Doctor {
    public Dantist() {
        super("Дантист", 2);
    }

    public void treat(Patient patient) {
        System.out.println("Дантист сверлит зубы");
    }
}
