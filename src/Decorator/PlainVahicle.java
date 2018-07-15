package Decorator;

public class PlainVahicle implements Vehicle {
    @Override
    public String getDescription() {
        return "Basic Structure";
    }

    @Override
    public double getPrice() {
        return 410.50;
    }
}
