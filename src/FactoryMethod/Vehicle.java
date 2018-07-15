package FactoryMethod;

public abstract class Vehicle {
    private String name;
    private int topSpeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void move(){
        System.out.println(this.getName() + " is moving.");
    }

    public void stop(){
        System.out.println(this.getName() + " is stopping.");
    }


}
