package lesson18.NewTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainNumbers {
    //    2. Сумма чисел, кратных 3 или 5
//    Дан список List<Integer> numbers. Найти сумму всех чисел, кратных 3 или 5.
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        List<Integer> numb = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int randomNumber = randomGenerator.nextInt(1000);
            numb.add(randomNumber);
        }
        System.out.println(numb);

        int sum = numb.stream()
                .filter(num -> num % 3 == 0 || num % 5 == 0)
                .peek(num-> System.out.println(num))
                .mapToInt(Integer->Integer.intValue())
                .sum();
        System.out.println(sum);
    }
}
