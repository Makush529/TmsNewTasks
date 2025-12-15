package lesson30.singleton;

/*Паттерн Одиночка обеспечивает наличие
только одного экземпляра класса и предоставляет
глобальную точку доступа к этому экземпляр*/
import java.util.ArrayList;
import java.util.List;

public class FirstSingleton {
    private static FirstSingleton instance;
    private List<String> names;

    private FirstSingleton() {
        this.names = new ArrayList<>();
    }

    public static FirstSingleton getInstance() {
        if (instance==null){
            instance=new FirstSingleton();
        }
        return instance;
    }
    public void addName(String name){
        names.add(name);
    }
    public void printNames(){
        System.out.println("Collection names: " + names);
    }
}
