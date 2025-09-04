package lesson7;

public class Doctor {
    String name;
    String lastName;
    String specialty;
    int age;

    public Doctor(String specialty, String name, String lastName, int age) {
        this.specialty = specialty;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Doctor(String specialty, String name) {
        this.specialty = specialty;
        this.name = name;
    }

    public Doctor(String specialty) {
        this.specialty = specialty;
    }
    public void treat(){}
}
    /* Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
 хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
 по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
 «Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
 терапевта создать метод, который будет назначать врача пациенту согласно плану
 лечения:
 Если план лечения имеет код 1– назначить хирурга и выполнить метод лечить.
 Если план лечения имеет код 2– назначить дантиста и выполнить метод лечить.
 Если план лечения имеет любой другой код– назначить терапевта и выполнить метод
 лечить*/


