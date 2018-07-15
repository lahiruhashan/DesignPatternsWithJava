package Proxy;

public class ATMProxy implements GetATMData{
    @Override
    public int getATMState() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getATMState();
    }

    @Override
    public int getAmount() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getAmount();
    }
}
