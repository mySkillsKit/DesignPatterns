package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        BankCardFactory cardFactory = new AlfaBankCard();
        Digital digital = cardFactory.createDigital();

        BankCardFactory cardFactory2 = new SberBankCard();
        Debit debit = cardFactory2.createDebit();
    }
}
