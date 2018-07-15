package FactoryMethod;

import java.util.Scanner;

public class FactoryMethodMain {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle theVehicle = null;

        Scanner userInput = new Scanner(System.in);
        System.out.print("What Type of A Vehicle ? (C / B)");
        if (userInput.hasNextLine()){
            String vehicleType = userInput.nextLine();
            theVehicle = vehicleFactory.makeVehicle(vehicleType);
        }

        if (theVehicle != null){
            doStuff(theVehicle);
        }else{
            System.out.println("Enter Only B or C");
        }
    }

    private static void doStuff(Vehicle anyVehicle){
        anyVehicle.move();
        anyVehicle.stop();
    }
}
