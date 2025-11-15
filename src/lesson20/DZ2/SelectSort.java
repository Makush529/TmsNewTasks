package lesson20.DZ2;

import java.util.Arrays;

public class SelectSort implements Runnable {
    private int[] array;

    public SelectSort(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println("Result SelectSort" + Arrays.toString(array));
    }
}