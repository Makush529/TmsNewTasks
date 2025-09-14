package lesson9PolimorphAndStatic.Animal;

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
