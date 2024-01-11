package AbstractFactory;

public interface BankCardFactory {

    Debit createDebit();
    Credit createCredit();
    Digital createDigital();

}
