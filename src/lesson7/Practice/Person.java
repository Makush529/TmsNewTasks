package lesson7.Practice;

public class Person {
    /*Создать класс Person с полями name, age, gender. Поле name сделать public, age
    оставить по дефолту, gender– private. В классе Main создать объект Person.
    Предположить какие поля мы увидим. Продемонстрировать значения полей объекта
    используя геттеры и поля если это возможно*/
    public String name;
    int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(){
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
