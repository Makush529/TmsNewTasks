package lesson7;

public class Patient {
    String name;
    int treatPlan;//метод лечения
    Doctor hisDoctor;


    public Patient(String name, int treatPlan) {
        this.name = name;
        this.treatPlan = treatPlan;
    }

    public int getTreatPlan() {
        return treatPlan;
    }

    public Patient(String name) {
        this.name = name;

    }

    public void hisDoctor(Doctor[] doctors) {//назначить доктора

        for (Doctor doctor : doctors) {
            if (doctor.getTreatPlan() == treatPlan) {
                hisDoctor = doctor;
                System.out.println("Назначен лечащий врач: " + doctor.specialty);
                break;
            }
        }

    }

    public String getName() {
        return name;
    }

    public void hisTreat() {
        if (hisDoctor != null) {
            hisDoctor.treat(this);
        } else {
            System.out.println("Некому лечить: " + this.name);
        }
    }
}
