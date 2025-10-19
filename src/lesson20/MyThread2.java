package lesson20;

public class MyThread2 {
    //    Задача #2: Увеличение счётчика
//    Создайте программу, в которой два потока увеличивают счётчик на фиксированное значение. Счётчик общий для обоих потоков.
//    Задание: Создайте два потока, каждый из которых увеличивает счётчик на 10 раз по 1 единице. Покажите, каким станет итоговое значение счётчика.
//    Идея: понять, как потоки могут совместно использовать один ресурс (переменную), не заботясь пока о конкуренции.
    private static int counter = 0;

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counter++;
                    System.out.println("Поток1: " + counter);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counter++;
                    System.out.println("Поток2: " + counter);
                }
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }
        System.out.println("Результат: " + counter);
    }
}
