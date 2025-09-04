package lesson7;

public class Patient {
    String name;
    String lastName;
    int treatPlan;//метод лечения
    Doctor doctor;//типа лечащий врач

    public Patient(String name, String lastName, int treatPlan) {
        this.name = name;
        this.lastName = lastName;
        this.treatPlan = treatPlan;
        this.doctor = doctor;
    }

    public void hisDoctor() {
        if (treatPlan == 1) {
            doctor = new Doctor("Терапевт");//бред собачий, разобраться
            System.out.println();
        }
    }
}