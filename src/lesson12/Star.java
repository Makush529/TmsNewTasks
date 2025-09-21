package lesson12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Star {
    public static void main(String[] args) {
//        /*Задача *:
//        Программа на вход получает произвольный текст. В этом тексте может быть номер
//        документа(один или несколько), емейл и номер телефона. Номер документа в
//        формате: xxxx-xxxx-xx, где x- это любая цифра; номер телефона в формате:
//        +(xx)xxxxxxx. Документ может содержать не всю информацию, т.е. например, может не
//        содержать номер телефона, или другое. Необходимо найти эту информацию и вывести
//        в консоль в формате:
//        email: teachmeskills@gmail.com
//        document number: 1423-1512-51
//        и т.д*/

       /* +(45)5656566. Документ может содержать не всю информацию, т.е. например, может не
        содержать номер телефона, или другое. Необходимо найти эту информацию и вывести
        в консоль в формате:
        email: teachmeskills@gmail.com
        document number: 1423-1512-51*/
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String mail = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String fhone = "\\+\\d{2}\\d{7}";
        String number = "[0-9]{4}-[0-9]{4}-[0-9]{2}";

        Pattern patternMail = Pattern.compile(mail);
        Pattern patternFhone = Pattern.compile(fhone);
        Pattern patternNumber = Pattern.compile(number);

        Matcher matcherMail = patternMail.matcher(string);
        Matcher matcherFhone = patternFhone.matcher(string);
        Matcher matcherNumber = patternNumber.matcher(string);

        searchAndPrint(matcherNumber, "number");
        searchAndPrint(matcherFhone, "fhone");
        searchAndPrint(matcherMail, "mail");

    }

    public static void searchAndPrint(Matcher matcher, String text) {
        boolean rezult = false;
        while (matcher.find()) {
            System.out.println(text + " " + matcher.group());
            rezult = true;
        }
        if (!rezult) {
            System.out.println("ничего не найдено");
        }
    }
}
