package AbstractFactory;

public class SberBankCard implements BankCardFactory {
    @Override
    public Debit createDebit() {
        return new SberDebitCard();
    }

    @Override
    public Credit createCredit() {
        return new SberCreditCard();
    }

    @Override
    public Digital createDigital() {
        return new SberDigitalCard();
    }
}
