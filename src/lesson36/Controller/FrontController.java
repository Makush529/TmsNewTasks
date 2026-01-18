package lesson36.Controller;

import java.util.Scanner;

public class FrontController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя операции(1 или 2), для завершения работы введите EXIT : ");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("1")) {
                FirstOperationHandler firstOperationHandler = new FirstOperationHandler();
                firstOperationHandler.getOperation();
            } else if (input.equals("2")) {
                SecondOperationHandler secondOperationHandler = new SecondOperationHandler();
                secondOperationHandler.getOperation();
            } else if(input.equals("EXIT")){
                return;
            }else {
                System.out.println("Неверный запрос! Попробуй снова!");
            }
        }
    }
}
