package lesson9PolimorphAndStatic.Animal;

/*Задача 1:
Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
Переопределить методы voice(), eat(String food) чтобы они выводили верную
информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
        Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
или другую строку то он будет недоволен*/
abstract class Animal {

    abstract public void voice();

    abstract public void eat(String food);
}

class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Голос собаки");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("Собака любит есть мясо");
        } else {
            System.out.println("Собака такое есть не будет");
        }
    }
}

class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Тигр рычит");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("Тигр съест мясо");
        } else {
            System.out.println("Тигр есть только мясо");
        }
    }
}

class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Кролик голос! - Отвечает что то по-кроличьи");
    }

    @Override
    public void eat(String food) {
        if ("Grass".equals(food)) {
            System.out.println("Траву кролик съест");
        }
        if ("Meat".equals(food)) {
            System.out.println("Кролик не ест мясо");
        } else {
            System.out.println("Такое кролик не будет есть");
        }
    }
}

