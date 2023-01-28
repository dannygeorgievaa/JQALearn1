package Homework4;

public class ComputerHomework4 {
    int year;
    double price;
    String operationSystem;

    public ComputerHomework4(int year, double price, String operationSystem)
    {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    public static int comparePrices() {

        ComputerHomework4 computer = new ComputerHomework4(2022, 3000, "Windows");
        ComputerHomework4 computer1 = new ComputerHomework4(2020, 4000, "MacOS");
        if (computer.price == computer1.price)
            return 0;
        else if (computer.price > computer1.price) {
            return -1;
        } else if (computer.price < computer1.price) {
            return 1;
        }
        //   System.out.println("Computer 1 is the same as Computer 2" );
        // System.out.println("Computer 1 is the same as Computer 2" );
        // else if ()System.out.println("The computers are different");
        // Homework4.ComputerHomework4 computer1 = new Homework4.ComputerHomework4()
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(comparePrices());

    }
}