package lesson6.Astra;

public class AtmBank {
    /*Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
    задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
    метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
    принимает сумму денег, а возвращает булевое значение - успешность выполнения
    операции. При снятии денег, функция должна распечатывать каким количеством купюр
    какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
    количеством купюр каждого номинала.*/

    //количество купюр в баномате
    int numTwenty;
    int numFifty;
    int numHundred;


    public AtmBank(int numHundred, int numFifty, int numTwenty) {
        this.numHundred = numHundred;
        this.numFifty = numFifty;
        this.numTwenty = numTwenty;
    }

    //пополнение денег в банкомате
    void addCash(int hundred, int fifty, int twenty) {
        if ((twenty >= 0 && fifty >= 0 && hundred >= 0) && (twenty + hundred + fifty) != 0) {
            numHundred = numHundred + hundred;
            numFifty = numFifty + fifty;
            numTwenty = numTwenty + twenty;
            int sumInBankomat = numFifty * 50 + numTwenty * 20 + numHundred * 100;
            System.out.println("Внесенная сумма: " + (100 * hundred + 50 * fifty + 20 * twenty));
            System.out.println("Общее количество купюр в банкомате: 100: " + numHundred + ", 50: " + numFifty + ", 20: " + numTwenty);
            System.out.println("Общая сумма в банкомате: " + sumInBankomat);
        } else {
            System.out.println("Пополнение невозможно ");
        }
    }

    boolean withdraft(int cash) {
        System.out.println("Сумма снятия: " + cash);
        int sumMoney = 20 * numTwenty + 50 * numFifty + 100 * numHundred;
        if (sumMoney < cash || cash < 20 || cash % 10 != 0) {
            System.out.println("Некорректная сумма либо недостаточно средств для выдачи");
            return false;
        }
        int[] numInBank = {numHundred, numFifty, numTwenty};//количество купюр в банкомате
        int[] values = {100, 50, 20};//значения купюр
        int[] numCash = {0, 0, 0,};//перезаписываемые выданные купюры на руки

        for (int i = 0; i < numCash.length; i++) {
            if (numInBank[i] <= (cash / values[i])) {
                numCash[i] = numInBank[i];
                cash = cash - numCash[i] * values[i];
            } else {
                numCash[i] = cash / values[i];
                cash = cash - numCash[i] * values[i];
            }
        }
        if (cash != 0) {
            System.out.println("vse");
            return false;
        }
        //количество купюр в банкомате
        numTwenty = numTwenty-numCash[2];
        numFifty = numFifty-numCash[1];
        numHundred = numHundred-numCash[0];

        System.out.println("Выдынно купюр 100: " + numCash[0] + "; Выданно купюр 50: " + numCash[1] + "; Выданно купюр 20: " + numCash[2]);
        return true;


    }

    void infoAtmBank(){
        System.out.println("Остаток купюр в банокмате, 100: " + numHundred + "; 50: "+ numFifty + "; 20 " +numTwenty);
    }


}








