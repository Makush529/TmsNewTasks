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

/*Задача 1:
Используя FileOutputStream и FileInputStream записать в файл tms.txt строку, введенную
пользователем с консоли. Считать строку из файла tms.txt и вывести в консоль, заменив
все пробелы на знак нижнего подчеркивания*/
public class Task1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringUser = scanner.nextLine();

        try (FileOutputStream fileOutputStream = new FileOutputStream("src/lesson14File/practice/Task1.txt")) {//создал объект для записи в файл
            fileOutputStream.write(stringUser.getBytes());//записал строку в фйал введенную через сканер и преобразовал в байты
        } catch (FileNotFoundException e) {
            System.out.println("error" + e.getMessage());
        } catch (IOException io) {
            System.out.println("error" + io.getMessage());
        }

        StringBuilder stringBuilder = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream("src/lesson14File/practice/Task1.txt")) {//создал объект для чтения из файла
            int bite;//переменная для хранения байтов
            while ((bite = fileInputStream.read()) != -1) {//читаем байты, когда байты кончатся значение будет -1
                stringBuilder.append((char) bite);//записываем байты в стрингбилдер, преобразуем в char!
            }
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }

        String result = stringBuilder.toString().replace(" ", "_");// преобразование в строку, замена пробела на "_"
        System.out.println(result);
    }
}
