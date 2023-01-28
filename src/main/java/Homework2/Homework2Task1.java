package Homework2;

import java.util.Scanner;

public class Homework2Task1 {
static void  SumTwoIntegers () {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer number:");
    int firstNumber = scan.nextInt();
    System.out.println("Enter second integer number:");
    int secondNumber = scan.nextInt();
    int sum = firstNumber + secondNumber;
    System.out.println(firstNumber + " + " + secondNumber + " = "  + sum );


}

    public static void main(String[] args) {
        SumTwoIntegers();
    }
}

