package Strategy;

public class Animal {
    public Flys flyType;

    public void tryToFly() {
        this.flyType.fly();
    }

    public void setFlyType(Flys flyType) {
        this.flyType = flyType;
    }
}
