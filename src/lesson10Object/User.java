package lesson10Object;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String firstName;
    LocalDate birthDate;
    private String maile;

    public User(String firstName, int birthDate, String maile) {
        this.firstName = firstName;
        this.birthDate = LocalDate.ofEpochDay(birthDate);
        this.maile = maile;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", birthDate=" + birthDate +
                ", maile='" + maile + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(birthDate, user.birthDate) && Objects.equals(maile, user.maile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, birthDate, maile);
    }
}
