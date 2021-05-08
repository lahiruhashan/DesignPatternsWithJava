package Strategy;

public class AnimalPlay {
    public static void main(String[] args) {
        Animal bird = new Bird();
        bird.tryToFly();
        Animal dog = new Dog();
        dog.tryToFly();
        dog.setFlyType(new FlyHigh());
        dog.tryToFly();
    }
}
