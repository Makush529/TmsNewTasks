package lesson15List.Home3;

import java.util.HashSet;

public class Student {
    //    Задача 3:
//    Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
//    оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
//    Написать метод, который удаляет студентов со средним баллом <3. Если средний
//    балл>=3, студент переводится на следующий курс. Дополнительно написать метод
//    printStudents(List<Student> students, int course), который получает список студентов и
//    номер курса. А также печатает на консоль имена тех студентов из списка, которые
//    обучаются на данном курсе.
    private String name;
    private int group;
    private int course;

    private int averegePoint;

    public Student(String name, int group, int course, int averegePoint) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.averegePoint = averegePoint;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAveregePoint() {
        return averegePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", averegePoint=" + averegePoint +
                '}';
    }
}
