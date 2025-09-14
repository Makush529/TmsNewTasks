package lesson10.clone.clone;

import java.time.LocalDate;

public class User implements Cloneable {
    private String firstName;
    private String secondName;
    private LocalDate birthDate;
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public User(String firstName, String secondName, int year, int month, int day, Car car) {
        this.firstName = firstName;
        this.secondName = secondName;
        //this.birthDate = LocalDate.ofEpochDay(birthDate);
        this.birthDate = LocalDate.of(year, month, day);
        this.car = car;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws CloneNotSupportedException {
        User clonedUser = (User) clone(); // Поверхностное клонирование основных полей
        if (clonedUser.car != null) {
            clonedUser.car = (Car) clonedUser.car.clone(); // Дополнительно клонируем автомобиль
        }
        return clonedUser;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthDate=" + birthDate +
                ", car=" + car +
                '}';
    }
}
