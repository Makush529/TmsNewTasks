package lesson29.o;

public class MainOC {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        Builder builder = new Builder();
        Driver driver = new Driver();
        doc.responsibilities();
        driver.responsibilities();
        builder.responsibilities();
    }

}
