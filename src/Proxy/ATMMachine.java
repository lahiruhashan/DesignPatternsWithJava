package Proxy;

public class ATMMachine implements GetATMData{
    private int amount;
    private int state;
    private boolean correctPin;

    @Override
    public int getATMState() {
        return this.state;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setState(int state) {
        this.state = state;
    }

    public boolean isCorrectPin() {
        return correctPin;
    }

    public void setCorrectPin(boolean correctPin) {
        this.correctPin = correctPin;
    }


    public ATMMachine(){
        this.amount = 2000;
        this.state = 1;
        this.correctPin = false;
    }
}
