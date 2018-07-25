package Facade;

public class FundsCheck {
    private double cashInAccount = 1000.00;

    private double getCashInAccount() {
        return cashInAccount;
    }

    private void decreaseCaseInAccount(double amount){
        this.cashInAccount -= amount;
    }

    private void increaseCashInAccount(double amount){
        this.cashInAccount += amount;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal){
        if (cashToWithdrawal > getCashInAccount()){
            System.out.println("Transaction Failed!!!");
            System.out.println("You do not have enough money");
            System.out.println("Current balance is :" + getCashInAccount());
            return false;
        }else {
            decreaseCaseInAccount(cashToWithdrawal);
            System.out.println("Withdrawal complete. Current balance is : " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposite(double cashToDeposite){
        increaseCashInAccount(cashToDeposite);
        System.out.println("Deposit Complete. Current Balance is : " + getCashInAccount());
    }
}
