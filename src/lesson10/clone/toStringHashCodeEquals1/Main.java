package lesson10.clone.toStringHashCodeEquals1;

public class Main {
    public static void main(String[] args) {

        User user = new User("John", 1999 - 12 - 3, "male");
        System.out.println(user.toString());//необязательно писать оказывается, главное просто переопределить
        System.out.println(user.hashCode());

        User[] users = new User[4];
        users[0] = new User("Villy", 2000 - 1 - 3, "male");
        users[1] = new User("Don", 2003 - 2 - 5, "male");
        users[2] = new User("Villy", 2000 - 1 - 3, "male");
        users[3] = new User("Joan", 2003 - 3 - 9, "female");
        int numEquals = 0;//счетчик проверок
        for (int i = 0; i < users.length; i++) {

            for (int j = i + 1; j < users.length; j++) {
                numEquals++;
                System.out.println(numEquals + ":Cравнение объектов " + users[i].getFirstName() + " и " + users[j].getFirstName());
                if (users[i].hashCode() == users[j].hashCode()) {//сравним сначал  hashCode
                    System.out.println("Хешкоды равны");
                    if (users[i].equals(users[j])) {
                        System.out.println("Объекты одинаковые\n");
                    } else {
                        System.out.println("Объекты разные\n");
                    }

                } else {
                    System.out.println("Объекты разные\n");
                }
            }
        }
        System.out.println("Проверка совпадения по полу");
        for (int i = 0; i < users.length; i++) {

            for (int j = i + 1; j < users.length; j++) {
                numEquals++;
                System.out.println(numEquals + ":Cравнение объектов " + users[i].getFirstName() + " и " + users[j].getFirstName());
                if (users[i].newEqualsName(users[j])) {
                    System.out.println("Объекты одного пола\n");
                } else {
                    System.out.println("Объекты разного пола\n");
                }

            }


        }


    }
}
