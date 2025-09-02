package lesson6;

public class Main {
    public static void main(String[] args) {
        /* Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
     третьей. Выведите на экран текущее состояние всех трех карточек.*/
        CreditCard card1 = new CreditCard(111, 200);
        CreditCard card2 = new CreditCard(222, 10);
        CreditCard card3 = new CreditCard(333, 0);

        card1.addCash(500);
        card2.addCash(90);
        card3.wihtdraw(10);

        card1.infoAccountNumber();
        card2.infoAccountNumber();
        card3.infoAccountNumber();


    }
}
