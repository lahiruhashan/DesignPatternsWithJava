package Facade;

public class AccountNumberCheck {
    private int accountNumber = 12345678;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isAcountActive(int accountNumber){
        if (this.accountNumber == accountNumber){
            return true;
        }else{
            return false;
        }
    }
}
