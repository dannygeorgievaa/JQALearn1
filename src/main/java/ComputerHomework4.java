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
        // ComputerHomework4 computer1 = new ComputerHomework4()
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(comparePrices());

    }
}
//Създайте клас Computer със следните полета от тип:
//int year,
//double price,
//String operationSystem
//Класът Computer да има следния конструктор:
//констуктор с параметри Compter(int year, double price, String operationSystem),
// който да инициализира всички полета със стойноститеподадени му като аргументи.
// С помоща на ключовата дума THIS В същия клас създайте метод int comparePrice(Computer compare),
// който сравнява цените на 2 компютъра и връща стойност (използвайте return).
// Ако цената на първия компютър (този, за който се вика метода) е по-висока от тази на компютъра подаден като аргумент, метода връща -1.
// Ако цената на компютъра подаден като аргумент (втория компютър) е по-високата, се връща 1, а ако са равни, метода връща стойност 0
//Стойностите/цените на двата компътъра да бъдат изнесени в отделен клас ComputerPrices с main метод.
// Цената на първия компютър да бъде декларирана с помоща на обект от клас Computer,
// а цената на втория компютър да бъде извлечена с подаване на стойности в конструктора
// на клас Computer - Computer(int year, double price, String operationSystem)