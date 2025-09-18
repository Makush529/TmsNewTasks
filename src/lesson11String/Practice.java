package lesson11String;

public class Practice {
    public static void main(String[] args) {
        /*Практика:
        Задача 1:
        1.1 Объединить 2 строки в одну 2-мя способами.
        1.2 Проверить 2 строки на равенство с и без учета регистра.
        1.3 Вернуть подстроку с 3-го символа до конца.
        1.4 Вывести длину строки
        1.5 Вывести порядковый номер любого символа в строке.
        1.6 Преобразовать логический тип true к строке.
        1.7 Перевести строку в верхний регистр.
        1.8 Заменить ‘1’ в строке на ‘%’.
        1.9 Убрать все пробелы в строке с двух сторон.
        1.10 Проверить, пустая ли строка.
        1.11 Разбить строку на несколько по делителю.
        Задача 2:
        2.1 Создать объект StringBuilder c любой строкой.
        2.2 Добавить к строке “xxxx”.
        2.3 В 5-ю позицию вставить “y”.
        2.4 Удалить символы с 3 по 6.
        2.5 Перевернуть строку.
        2.6 Преобразовать в String и вывести в консоль.*/

        String text = "Новый текст";
        String textNew = "Дополнительный текст и цифры 24";
        String textUp = "новый текст";

        System.out.println("1.1 " + text.concat("\n").concat(textNew));

        System.out.println("1.2 " + text.equalsIgnoreCase(textUp));
        System.out.println(text.equals(textUp));

        String textTest = "Тестовый набор символов";

        System.out.println("1.3 " + textTest.substring(3));
        System.out.println("1.4 " + text.length());
        System.out.println("1.5 " + text.charAt(6));
        int[] idexText = {3, 8, 9};
        System.out.print("1.6 ");
        for (int dhgs : idexText) {
            System.out.print(" " + text.charAt(dhgs));
        }


    }
}
