package lesson17DateTimeApi.lambda;

public class Task4Lambda {
    //    Задача 4:
//    При помощи лямбда выражения реализовать логику, при которой, если а < b, то вернуть
//    а. Если a > b, то вернуть b. Иначе вернуть 0
    public static void main(String[] args) {
        IShape metod1 = (a, b) -> {
            if (a < b) {
                return a;
            }
            if (a > b) {
                return b;
            }
            if (a == b) {
                return 0;
            }
            return a;
        };
        System.out.println(metod1.getSquare(5,5));
    }
}

