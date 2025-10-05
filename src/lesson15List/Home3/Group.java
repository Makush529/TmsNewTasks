package lesson15List.Home3;

import java.util.HashSet;

public class Group {
    public HashSet<Student> students;

    public Group() {
        this.students = new HashSet<>();
    }

    public Group(HashSet<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);

    }

    public void removeBadStudent() {
        students.removeIf(student -> student.getAveregePoint() < 3);
    }

    public void upCourse() {
        for (Student upStudent : students) {
            if (upStudent.getAveregePoint() >= 3) {
                upStudent.setCourse(upStudent.getCourse() + 1);
            }
        }
    }

    public void infoStudent() {
        System.out.println("студенты курса: ");
        for (Student student : students) {
            System.out.println("Имя: " + student.getName() + "; Курс: " + student.getCourse() + "; Средний балл:  " + student.getAveregePoint());
        }
    }
}