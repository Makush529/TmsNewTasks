package lesson10Object.toStringHashCodeEquals;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String firstName;
    LocalDate birthDate;
    private String gender;

    public User(String firstName, int birthDate, String gender) {
        this.firstName = firstName;
        this.birthDate = LocalDate.ofEpochDay(birthDate);
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(birthDate, user.birthDate) && Objects.equals(gender, user.gender);
    }

    public boolean newEqualsName(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(gender, user.gender);
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, birthDate, gender);
    }
}
