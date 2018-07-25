package Facade;

public class TransactionFacade {

    private  int accountNumber;
    private  int securityCode;
    private AccountNumberCheck accountNumberCheck;
    private SecurityCodeCheck securityCodeCheck;
    private WelcomeBankMessage welcomeBankMessage;
    private FundsCheck fundsCheck;

    public TransactionFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        welcomeBankMessage = new WelcomeBankMessage();
        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToWithdraw){
        if (accountNumberCheck.isAcountActive(this.accountNumber) && securityCodeCheck.isSecurityCodeCorrect(securityCode)
                && fundsCheck.haveEnoughMoney(cashToWithdraw)){
            System.out.println("Transaction Complete.\n");
        }else{
            System.out.println("Transaction Failed.\n");
        }
    }

    public void depositCash(double cashToDeposit){
        if (accountNumberCheck.isAcountActive(this.accountNumber) && securityCodeCheck.isSecurityCodeCorrect(securityCode)){
            fundsCheck.makeDeposite(cashToDeposit);
            System.out.println("Transaction Complete.\n");
        }else{
            System.out.println("Transaction Failed.\n");
        }
    }
}
