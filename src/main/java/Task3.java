import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();
       // int saveValueFfNumberTwo = secondNumber;
       // int saveValueOfNumberThree = thirdNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        int sum = firstNumber + secondNumber;
        int substraction = sum - thirdNumber;
        System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum );
        System.out.println(sum + " - " + thirdNumber + " = " + substraction);



    }
}
