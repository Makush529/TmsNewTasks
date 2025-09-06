package lesson7;

public class Main {
    public static void main(String[] args) {
        Doctor therapist = new Therapist();
        Doctor berserk = new Berserk();
        Doctor dantist = new Dantist();

        Doctor[] doctors = {therapist, berserk, dantist};

        Patient patient = new Patient("Dan", 2);

        patient.hisDoctor(doctors);

        patient.hisTreat();


    }


}
