package AbstractFactory;

public class AlfaBankCard implements BankCardFactory {
    @Override
    public Debit createDebit() {
        return new AlfaDebitCard();
    }

    @Override
    public Credit createCredit() {
        return new AlfaCreditCard();
    }

    @Override
    public Digital createDigital() {
        return new AlfaDigitalCard();
    }
}
