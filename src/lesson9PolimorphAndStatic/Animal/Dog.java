package lesson9PolimorphAndStatic.Animal;

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
