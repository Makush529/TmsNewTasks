package lesson7;

public class Therapist extends Doctor{
    public Therapist(String specialty) {
        super(specialty);
    }

    public Therapist(String specialty, String name) {
        super(specialty, name);
    }

    public Therapist(String specialty, String name, String lastName, int age) {
        super(specialty, name, lastName, age);
    }
    public void treat(){
        System.out.println("therapist");//доделать
    }
}
