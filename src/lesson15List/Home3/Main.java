package lesson15List.Home3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob", 4, 1, 3);
        Student student2 = new Student("Rob", 4, 1, 2);
        Student student3 = new Student("Ben", 4, 1, 5);
        Student student4 = new Student("Ned", 4, 1, 4);
        Student student5 = new Student("Roy", 4, 1, 3);

        Group group = new Group();
        group.addStudent(student);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);

        group.infoStudent();
        group.removeBadStudent();
        group.upCourse();
        group.infoStudent();
    }
}
