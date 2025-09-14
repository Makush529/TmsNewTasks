package lesson10Object;

public class Main {
    public static void main(String[] args) {

        User user = new User("John", 1999 - 12 - 3, "man");
        System.out.println(user.toString());//необязательно писать оказывается, главное просто переопределить

        User[] users = new User[4];
        users[0] = new User("Villy", 2000 - 1 - 3, "man");
        users[1] = new User("Don", 2003 - 2 - 5, "man");
        users[2] = new User("Villy", 2000 - 1 - 3, "man");
        users[3] = new User("Joan", 2003 - 3 - 9, "female");
        int numEquals = 0;//счетчик проверок
        for (int i = 0; i < users.length; i++) {

            for (int j = 0; j < users.length; j++) {
                numEquals++;
                System.out.println(numEquals + ":Cравнение объектов " + users[i].getFirstName() + " и " + users[j].getFirstName());
                if (users[i].equals(users[j])) {
                    System.out.println("Объекты одинаковые\n");
                } else {
                    System.out.println("Объекты разные\n");
                }

            }


        }
    }
}
