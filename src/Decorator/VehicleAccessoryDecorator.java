package Decorator;

public class VehicleAccessoryDecorator implements Vehicle {

    protected Vehicle tempVehicle;

    public VehicleAccessoryDecorator(Vehicle tempVehicle) {
        this.tempVehicle = tempVehicle;
    }

    @Override
    public String getDescription() {
        return tempVehicle.getDescription();
    }

    @Override
    public double getPrice() {
        return tempVehicle.getPrice();
    }
}
