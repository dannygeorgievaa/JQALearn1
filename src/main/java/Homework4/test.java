package Homework4;

import Homework4.Car;

import java.util.Scanner;

public class test {
    public static void main(double fuel) {
        // public void usedFuel (double fuel){
        Car f = new Car();
        Scanner scan = new Scanner(System.in);
        double freeFuel = scan.nextDouble();
        freeFuel = (int) (f.fuelTankCapacity - fuel);
        if (freeFuel > f.fuelTankCapacity)
            System.out.println("Not enough fuel! ");
        else
            System.out.println("You have enough fuel.");


    }
}

