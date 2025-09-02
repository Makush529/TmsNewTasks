package lesson6;

public class CreditCard {
    /*Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
     метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
     который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
     выводит текущую информацию о карточке. Напишите программу, которая создает три
     объекта класса CreditCard у которых заданы номер счета и начальная сумма.
     Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
     третьей. Выведите на экран текущее состояние всех трех карточек.*/
    int accountNumber;
    int sumAccountNumber;

    public CreditCard(int accountNumber, int sumAccountNumber) {
        this.accountNumber = accountNumber;
        this.sumAccountNumber = sumAccountNumber;
    }

    void wihtdraw(int cash) {
        //cash = 10;
        if (sumAccountNumber < cash) {
            System.out.println("Максимальная сумма снятия составляет " + sumAccountNumber);
        } else {
            sumAccountNumber = sumAccountNumber - cash;
            System.out.println("Сумма на счете " + accountNumber + " составляет " + sumAccountNumber);
        }
    }

    void addCash(int cash) {
        sumAccountNumber = sumAccountNumber + cash;
        System.out.println("Сумма на счете " + accountNumber + " составляет " + sumAccountNumber);
    }

    void infoAccountNumber() {
        System.out.println("Сумма на счете " + accountNumber + " составляет " + sumAccountNumber);
    }
}
