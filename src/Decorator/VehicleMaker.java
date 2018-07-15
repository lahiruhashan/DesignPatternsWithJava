package Decorator;

public class VehicleMaker {
    public static void main(String[] args) {
        Vehicle basicVehicle = new Hood(new Spoiler(new PlainVahicle()));

        System.out.println(basicVehicle.getDescription());
        System.out.println(basicVehicle.getPrice());
    }
}
