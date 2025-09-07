package lesson7.Clinic;

public class Doctor {
    protected String specialty;
    protected int treatPlan;

    public Doctor(String specialty, int treatPlan) {
        this.specialty = specialty;
        this.treatPlan = treatPlan;

    }


    public String getSpecialty() {
        return specialty;
    }

    public int getTreatPlan() {
        return treatPlan;
    }

    public void treat(Patient patient) {

    }

}


