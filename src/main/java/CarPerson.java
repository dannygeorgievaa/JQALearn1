import java.sql.SQLOutput;

public class CarPerson {
    public static void main(String[] args) {
        Car carPerson = new Car();
        carPerson.year = 1998;
        carPerson.isCarSport = true;
        carPerson.freeFuel = 5;
        carPerson.fuelTankCapacity = 60;


        Car carPerson1 = new Car();
        carPerson1.year = 2010;
        carPerson1.isCarSport = false;
        carPerson1.freeFuel = 10;
        carPerson1.fuelTankCapacity = 45;

       // System.out.println(carPerson1.freeFuel + " " + carPerson.fuelTankCapacity);
    }

}
