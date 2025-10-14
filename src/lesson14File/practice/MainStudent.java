package lesson14File.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("John", LocalDate.of(1999, 12, 11), "Math");
        System.out.println(student1);

        try (FileOutputStream fileOutputStreamStudent = new FileOutputStream("src/lesson14File/practice/student.txt");
             ObjectOutputStream objectOutputStreamStudent = new ObjectOutputStream(fileOutputStreamStudent)) {
            objectOutputStreamStudent.writeObject(student1);
        } catch (Exception e) {
            e.getStackTrace();
        }
        Student newStudent = null;
        try (FileInputStream fileInputStreamStudent = new FileInputStream("src/lesson14File/practice/student.txt");
             ObjectInputStream objectInputStreamStudent = new ObjectInputStream(fileInputStreamStudent)) {
            newStudent = (Student) objectInputStreamStudent.readObject();
        } catch (Exception e) {
            e.getStackTrace();
        }
        if (newStudent != null) {
            System.out.println("Загруженный студент: " + newStudent);
        }
    }
}
