package lesson9PolimorphAndStatic.Animal;

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
