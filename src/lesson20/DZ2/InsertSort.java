package lesson20.DZ2;

import java.util.Arrays;

public class InsertSort implements Runnable {
    private int[] array;

    public InsertSort(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 1; i < array.length; i++) {
            int numbMove = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > numbMove) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = numbMove;
        }
        System.out.println("Result InsertSort " + Arrays.toString(array));
    }
}