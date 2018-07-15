package FactoryMethod;

public class VehicleFactory {
    public Vehicle makeVehicle(String newVehicleType){

        if (newVehicleType.equalsIgnoreCase("C")){
            return new Car();
        }else if (newVehicleType.equalsIgnoreCase("B")){
            return new Bus();
        }else{
            return null;
        }
    }
}
