package lesson7;

public class Patient {
    protected String name;
    protected int treatPlan;//метод лечения
    protected Doctor hisDoctor;


    public Patient(String name, int treatPlan) {
        this.name = name;
        this.treatPlan = treatPlan;
    }

    public void hisDoctor(Doctor[] doctors) {//назначить доктора

        for (Doctor doctor : doctors) {
            if (doctor.getTreatPlan() == treatPlan) {
                hisDoctor = doctor;
                System.out.println("Назначен лечащий врач: " + doctor.specialty);
                break;
            }
        }
        if (hisDoctor == null) {
            for (Doctor doctor : doctors) {
                if (doctor.getSpecialty().equals("Терапевт")) {
                    hisDoctor = doctor;
                    System.out.println("Назначен лечащий врач: " + doctor.getSpecialty());
                    break;
                } else {
                    System.out.println("Тут мог бы помочь терапевт, но его нет");
                }
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
            System.out.println(this.name + " остался без лечения");
        }
    }
}
