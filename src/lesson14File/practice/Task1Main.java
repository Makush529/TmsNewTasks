package lesson14File.practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

        try (FileOutputStream fileOutputStream = new FileOutputStream("src/lesson14File/practice/Task1.txt")) {
            fileOutputStream.write(stringUser.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("ghrh");
        } catch (IOException io) {
            System.out.println("tht");
        }
        StringBuilder stringBuilder =new StringBuilder();
        try(FileInputStream fileInputStream = new FileInputStream("src/lesson14File/practice/Task1.txt")){
            int bite;
            while ((bite = fileInputStream.read())!=-1){
                stringBuilder.append((char) bite);
            }
        }catch (IOException e){}

        String result = stringBuilder.toString().replace(" ","_");
        System.out.println(result);
    }
}
