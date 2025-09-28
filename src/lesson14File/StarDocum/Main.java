package lesson14File.StarDocum;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //C:\tests\testDocum.txt
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("неверный путь");
        }
        File valueDoc = new File("C:\\tests\\valueDoc.txt ");
        File inValueDoc = new File("C:\\tests\\inValueDoc.txt");
        try (FileReader fileReaderTest = new FileReader(file);
             FileWriter valueFileWriter = new FileWriter(valueDoc);
             FileWriter inValueFileWriter = new FileWriter(inValueDoc);
             BufferedReader bufferedReaderTest = new BufferedReader(fileReaderTest);
             BufferedWriter valueBufferedWreaderTest = new BufferedWriter(valueFileWriter);
             BufferedWriter inValueBufferedWreaderTest = new BufferedWriter(inValueFileWriter);) {

            //StringBuilder stringBuilderTest = new StringBuilder();
            String line;
            while ((line = bufferedReaderTest.readLine()) != null) {
                if (isValue(line)) {
                    valueBufferedWreaderTest.write(line);
                    valueBufferedWreaderTest.newLine();
                    System.out.println("valid " + line);
                } else {
                    inValueBufferedWreaderTest.write(line +" "+ inValueInfo(line));
                    inValueBufferedWreaderTest.newLine();
                    System.out.println("invalid " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("vse " + e.getMessage());
        } catch (RuntimeException e2) {
            System.out.println("use " + e2.getMessage());
        }
    }

    private static boolean isValue(String text) {
        return text.matches("^(docum|contract) [0-9]{15}$");
    }

    private static String inValueInfo(String text) {
        //Pattern pattern = Pattern.compile("^(docum|contract)\\s([0-9]{15})$");
        //Matcher matcher = pattern.matcher(text);
        String[] words = text.split(" ", 2);
        if (words.length != 2) {
            return "неверный формат";
        } else if (!(words[0].equals("docum") || words[0].equals("contract"))) {
            return "неверное имя документа";
        } else if (!words[1].matches("\\d{15}")) {
            return "неверный номер документа";
        }
        return "непонятно";
    }
}


//        InputStreamReader inputStreamReaderTest = new InputStreamReader(System.in);
//        try (FileReader fileReaderTest = new FileReader(String.valueOf(inputStreamReaderTest))) {
//            BufferedReader bufferedReaderTest = new BufferedReader(fileReaderTest);
//            StringBuilder stringBuilderTest = new StringBuilder();
//            String lineOfText = "";
//            while (lineOfText != null) {
//                lineOfText = bufferedReaderTest.readLine();
//                stringBuilderTest.append(lineOfText).append(" ");
//            }
//
//        } catch (IOException e) {
//            System.out.println("File not found" + e);
//        }
//    }
//}

