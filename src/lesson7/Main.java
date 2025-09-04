package lesson7;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Терапевт","Николас","Мадуро",2);
        Therapist therapist = new Therapist("Терапевт", "Форест", "Гамп,",0);

        Patient patient1 = new Patient("Иван", "Иваныч", 1);

        patient1.hisDoctor();


    }


}
