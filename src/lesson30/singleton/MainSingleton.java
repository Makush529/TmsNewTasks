package lesson30.singleton;

public class MainSingleton {
    public static void main(String[] args) {
    FirstSingleton singleton = FirstSingleton.getInstance();
    singleton.addName("Don");
    singleton.addName("Ben");
    singleton.printNames();
    }
}
