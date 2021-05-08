package Strategy;

public class Dog extends Animal {
    public Dog() {
        flyType = new CantFly();
    }
}
