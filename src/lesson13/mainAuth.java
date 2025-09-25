package lesson13;

import java.util.Scanner;

public class mainAuth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login, password, confirmPassword;
        boolean result;
        try {
            login = scanner.nextLine();
            password = scanner.nextLine();
            confirmPassword = scanner.nextLine();
            result =Authorisation.isValidLoginPassword(login,password,confirmPassword);
        } catch (WrongPasswordException | WrongLoginException exception) {
            System.out.println(exception);
        }finally {
            scanner.close();
        }

    }
}
