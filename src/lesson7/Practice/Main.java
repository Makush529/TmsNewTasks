package lesson7.Practice;

public class Main {
    public static void main(String[] args) {
        Person person1= new Person("John Doe", 20, "male");
        Person person2 = new Person();

        person2.name="Jane Doe";
        person2.age=34;
        person2.setGender("female");

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.getGender());

        System.out.println();

        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.getGender());
    }

}
