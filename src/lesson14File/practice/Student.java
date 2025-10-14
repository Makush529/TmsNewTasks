package lesson14File.practice;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable {
    private String name;
    private LocalDate berthDay;

    public Student(String name, LocalDate berthDay, String faculty) {
        this.name = name;
        this.berthDay = berthDay;
        this.faculty = faculty;
    }

    private String faculty;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", berthDay=" + berthDay +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
