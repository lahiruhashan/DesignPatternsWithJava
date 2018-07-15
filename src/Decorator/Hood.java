package Decorator;

public class Hood extends VehicleAccessoryDecorator {
    public Hood(Vehicle tempVehicle) {
        super(tempVehicle);

        System.out.println("Adding Hood");
    }

    public String getDescription() {
        return tempVehicle.getDescription() + ", Hood";
    }

    public double getPrice() {
        return tempVehicle.getPrice() + 15.80;
    }
}
