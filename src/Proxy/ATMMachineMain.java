package Proxy;

public class ATMMachineMain {
    public static void main(String[] args) {
        GetATMData atmProxy = new ATMProxy();

        System.out.println(atmProxy.getATMState());
        System.out.println(atmProxy.getAmount());
    }
}
