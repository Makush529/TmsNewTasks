package lesson8.factory;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Director director = new Director();
        Accauntant accauntant = new Accauntant();

        System.out.println(worker.hisProfession());
        System.out.println(director.hisProfession());
        System.out.println(accauntant.hisProfession());
    }
}
