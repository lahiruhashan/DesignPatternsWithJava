package Facade;

public class DoTransaction {
    public static void main(String[] args) {
        TransactionFacade transactionFacade = new TransactionFacade(12345678, 1234);
        transactionFacade.withdrawCash(100.00);
        transactionFacade.depositCash(1500.00);
        transactionFacade.withdrawCash(15000.00);
        transactionFacade.withdrawCash(50.00);
    }
}
