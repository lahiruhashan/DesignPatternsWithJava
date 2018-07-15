package Decorator;

public class Spoiler extends VehicleAccessoryDecorator {
    public Spoiler(Vehicle tempVehicle) {
        super(tempVehicle);

        System.out.println("Adding Basic Structure");

        System.out.println("Adding Spoiler");
    }

    public String getDescription() {
        return tempVehicle.getDescription() + ", Spoiler";
    }

    public double getPrice() {
        return tempVehicle.getPrice() + 20.60;
    }
}
