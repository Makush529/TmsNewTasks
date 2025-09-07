package lesson7.Practice;

public class Main {
    public static void main(String[] args) {
        Person person1= new Person("John Doe", 20, "male");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.getGender());
    }

}
