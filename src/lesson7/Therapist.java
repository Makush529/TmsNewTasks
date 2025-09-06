package lesson7;

public class Therapist extends Doctor{
    public Therapist() {
        super("Терапевт", 0);
    }

    public void treat(){
        System.out.println("Терапевт лечит как терапевт");//доделать
    }
}
