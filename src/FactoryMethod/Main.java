package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        BankCardFactory alfa = new AlfaBankCard();
        BankCard bankCard = alfa.createBankCard(BankCardType.DIGITAL);

        BankCardFactory sber = new SberBankCard();
        BankCard sberCard = sber.createBankCard(BankCardType.DEBIT);
    }
}
