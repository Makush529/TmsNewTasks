package lesson9PolimorphAndStatic.Animal;

class Cat extends Animal {
    private Cat() {//приватный конструктор, объект не создается
        System.out.println("проверка");
    }

    public static class NewCat {
        public static Cat methodNewCat() {//static!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            return new Cat();
        }
    }

    @Override
    public void voice() {
        System.out.println("Кот мурлычит");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("Кот съест мясо");
        } else {
            System.out.println("Кот не станет это есть");
        }
    }

/*    public static void main(String[] args) {
        Cat cat11 = new Cat();
    }*/
}
