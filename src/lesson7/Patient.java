package lesson7;

public class Patient {
    String name;
    int treatPlan;//метод лечения
    Doctor hisDoctor;


    public Patient(String name, int treatPlan) {
        this.name = name;
        this.treatPlan = treatPlan;
    }
    public Patient(String name) {
        this.name = name;

    }

    public void hisDoctor(Doctor[] doctors) {//назначить доктора

        for (Doctor doctor : doctors) {
            if (doctor.getTreatPlan() == treatPlan) {
                hisDoctor = doctor;
                break;
            }
        }

    }

    public void hisTreat() {
        if (hisDoctor != null) {
            hisDoctor.treat();
        } else {
            System.out.println("Некому лечить..");
        }
    }
}
