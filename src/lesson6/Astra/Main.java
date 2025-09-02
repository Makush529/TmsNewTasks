package lesson6.Astra;

public class Main {
    public static void main(String[] args) {
        AtmBank bankomat = new AtmBank(10,10,10);

        bankomat.addCash(0,2,0);
        bankomat.withdraft(400);
    }
}
