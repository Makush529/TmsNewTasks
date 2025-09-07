package lesson7.Clinic;

public class Therapist extends Doctor {
    public Therapist() {
        super("Терапевт", 0);
    }

    public void treat(Patient patient) {
        System.out.println("Терапевтическое лечение: " + patient.getName());
    }

}
