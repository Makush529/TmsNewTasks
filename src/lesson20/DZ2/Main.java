package lesson20.DZ2;

public class Main {
    public static void main(String[] args) {
        /*Задача 2:
        Сортировка массива цифр в нескольких потоках различными алгоритмами:
 сортировка вставками;
 сортировка выбором;
 сортировка пузырьком.
        Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
        результат отсортированных массивов в консоль.*/
        int[] arrayNumb2 = {10, 2, 45, 43, 23, 89, 56, 90};

        int[] arrayInsert = arrayNumb2.clone();
        int[] arraySelect = arrayNumb2.clone();
        int[] arrayBuble = arrayNumb2.clone();

        Thread inserSortThread = new Thread(new InsertSort(arrayInsert));
        Thread selectSortThread = new Thread(new SelectSort(arraySelect));
        Thread bublleSortthread = new Thread(new BubleSort(arrayBuble));
        inserSortThread.start();
        selectSortThread.start();
        bublleSortthread.start();
    }
}