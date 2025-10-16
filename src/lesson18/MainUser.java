package lesson18;

import java.util.Optional;

public class MainUser {
    public static void main(String[] args) {
        User userMan1 = new User("John");
        User userMan2 =  null;
        Optional<User> optionalUser = Optional.ofNullable(userMan1);
        Optional<User> optionalUser2 = Optional.ofNullable(userMan2);
        System.out.println(optionalUser.map(u->u.getName()).orElse("DEFAULT"));
        System.out.println(optionalUser2.map(User::getName).orElse("DEFAULT"));
    }
}
