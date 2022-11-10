import java.util.Scanner;

public class Homework2Task2 {
    static void AverageTwoIntegers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second integer number:");
        int secondNumber = scan.nextInt();
        int sum = firstNumber + secondNumber;
        double averageSum = sum / 2;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(sum + " / 2 " + " = " + averageSum);

    }

    public static void main(String[] args) {
        AverageTwoIntegers();
    }
}
