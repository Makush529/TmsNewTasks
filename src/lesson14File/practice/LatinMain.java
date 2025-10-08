package lesson14File.practice;

import java.io.FileReader;
import java.io.FileWriter;
//Задача 2:
//Используя FileReader и FileWriter сначала записать в файл tms2.txt фразу на латыни
//“Cognosce te ipsum”, а затем считать ее и вывести в консоль первую букву.

public class LatinMain {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("src/lesson14File/practice/Latin.txt")){
            fileWriter.write("Cognosce te ipsum");
        }catch (Exception e){
            System.out.println("Error " + e.getStackTrace());
        }
        StringBuilder stringBuilder= new StringBuilder();
        try(FileReader fileReader= new FileReader("src/lesson14File/practice/Latin.txt")){
            int line;
            while ((line=fileReader.read())!=-1){//readline
                stringBuilder.append((char)line);
            }
        }catch (Exception e){
            System.out.println("Error "+ e.getStackTrace());
        }
        char result = stringBuilder.toString().charAt(0);
        System.out.println(result);
    }
}
