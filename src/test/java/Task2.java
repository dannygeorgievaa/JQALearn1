import java.math.RoundingMode;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 4 numbers:");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        double thirdNumber = scan.nextDouble();
        double fourthNumber = scan.nextDouble();
        var saveValueOfFisrtNumber = firstNumber;
        var saveValueOfSecondNumber = secondNumber;
        firstNumber = (int) thirdNumber;
        secondNumber = (int) fourthNumber;
        thirdNumber =  (double) saveValueOfFisrtNumber;
        fourthNumber = (double) saveValueOfSecondNumber;
        System.out.println((int) firstNumber + "; " + (int) secondNumber + "; " + (int) thirdNumber + "; " + (int) fourthNumber);
        System.out.println((double) firstNumber + "; " + (double) secondNumber + "; " + (double) thirdNumber + "; " + (double) fourthNumber);
        //System.out.println(thirdNumber+ "; " + fourthNumber + ";  " + firstNumber + "; " + secondNumber);
    }
}
