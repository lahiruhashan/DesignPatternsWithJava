package Strategy;

public class CantFly implements Flys {
    @Override
    public void fly() {
        System.out.println("Cannot Fly");
    }
}
