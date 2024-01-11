package FactoryMethod;

public class SberBankCard extends BankCardFactory {

    @Override
    public BankCard createBankCard(BankCardType type) {
        BankCard bankCard = null;
        switch (type) {
            case DEBIT -> bankCard = new SberDebitCard();
            case CREDIT -> bankCard = new SberCreditCard();
            case DIGITAL -> bankCard = new SberDigitalCard();
        }
        System.out.println("создана карта:" + bankCard);
        return bankCard;
    }
}
