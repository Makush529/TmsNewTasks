package lesson10.clone.clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Nissan", 20);
        User user = new User("John", "Doe", 2000, 12, 2, car);

        User newUser = (User) user.clone();//дата!
        user.setFirstName("Don");

        System.out.println(user.toString());//оригинал
        System.out.println(newUser.toString());

        car.setName("BMW");
        System.out.println(user);
        System.out.println(newUser.toString());

        User newUser2 = (User) user.deepClone();//глубокое клонирование
        car.setName("T-34");
        System.out.println(user);
        System.out.println(newUser2.toString());


    }
}
