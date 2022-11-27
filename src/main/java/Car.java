import java.util.Scanner;

public class Car {
    int year;
    double price;
    boolean isCarSport;
    int fuelTankCapacity;
    int freeFuel;
    String engineFuelOperationSystem;

    public void changeЕngineFuelOperationSystem() {
        String engineFuelOperationSystem;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type Engine Fuel (gas, petrol,diesel)");
        String newEngineFuelOperationSystemParam;
        newEngineFuelOperationSystemParam = scan.next();
        engineFuelOperationSystem = newEngineFuelOperationSystemParam;
        if (engineFuelOperationSystem.equals("diesel") || engineFuelOperationSystem.equals("gas") || engineFuelOperationSystem.equals("petrol"))
            System.out.println("The fuel is " + engineFuelOperationSystem);
        else
            System.out.println("Enter right fuel");

//        public void usedFuel (double fuel){
//            freeFuel = (int) (fuelTankCapacity - fuel);
//            if (freeFuel > fuelTankCapacity)
//                System.out.println("Not enough fuel! ");
//            else
//                System.out.println("You have enough fuel.");
//            //Scanner scan1 = new Scanner(System.in);
           // System.out.println("Enter fuel usage: ");
           // double fuelusage = scan1.nextDouble();
           // freeFuel = (int) (fuelTankCapacity - fuel);
           // if (freeFuel > fuelTankCapacity)
           //     System.out.println("Not enough fuel! ");
          //  else
           //     System.out.println("You have enough fuel. ");
        }
    }
