package FactoryMethod;

public class AlfaBankCard extends BankCardFactory {

    @Override
    public BankCard createBankCard(BankCardType type) {
        BankCard bankCard = null;
        switch (type) {
            case DEBIT -> bankCard = new AlfaDebitCard();
            case CREDIT -> bankCard = new AlfaCreditCard();
            case DIGITAL -> bankCard = new AlfaDigitalCard();
        }
        System.out.println("создана карта:" + bankCard);
        return bankCard;
    }
}
