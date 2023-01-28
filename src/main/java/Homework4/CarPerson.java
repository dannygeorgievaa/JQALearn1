package Homework4;

import Homework4.Car;

public class CarPerson {
    public static void main(String[] args) {
        Car carPerson = new Car();
        carPerson.year = 1998;
        carPerson.isCarSport = true;
        carPerson.freeFuel = 5;
        carPerson.fuelTankCapacity = 60;
        carPerson.changeЕngineFuelOperationSystem();


        Car carPerson1 = new Car();
        carPerson1.year = 2010;
        carPerson1.isCarSport = false;
     //   carPerson1.usedFuel = 35;
        carPerson1.fuelTankCapacity = 45;

       // System.out.println(carPerson1.freeFuel + " " + carPerson.fuelTankCapacity);
    }

}

//Да се зададат стойности на всеки от колите за year, price,
//fuelTankCapacity, freeFuel, engineFuelOperationSystem.Нека едината кола да е спортна. На едната от колата да е заделено 35 литра гориво (чрез
//метода useFuel), а на другия, да се смени горивната система (чрез
//метода changeЕngineFuelOperationSystem), след което да се изведат на екрана всичките полета на дете коли
