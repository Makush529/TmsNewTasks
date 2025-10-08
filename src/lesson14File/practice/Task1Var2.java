package lesson14File.practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task1Var2 {


    /*Задача 1:
    Используя FileOutputStream и FileInputStream записать в файл tms.txt строку, введенную
    пользователем с консоли. Считать строку из файла tms.txt и вывести в консоль, заменив
    все пробелы на знак нижнего подчеркивания*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringUser = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter("src/lesson14File/practice/Task1.txt")) {
            fileWriter.write(stringUser);
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader fileReader = new FileReader("src/lesson14File/practice/Task1.txt")) {
            int bite;
            while ((bite = fileReader.read()) != -1) {
                stringBuilder.append((char) bite);
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }

        String result = stringBuilder.toString().replace(" ", "_");// преобразование в строку, замена пробела на "_"
        System.out.println(result);
    }
}


