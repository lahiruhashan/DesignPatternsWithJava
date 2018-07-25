package Facade;

public class SecurityCodeCheck {
    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isSecurityCodeCorrect(int securityCode){
        if (this.securityCode == securityCode){
            return true;
        }else{
            return false;
        }
    }
}
