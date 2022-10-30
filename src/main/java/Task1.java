import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        System.out.println("Enter an int number:");
        Scanner scan = new Scanner(System.in);
        int firstNumberInt = scan.nextInt();
        System.out.println("Enter a double number:");
        double secondNumberDouble = scan.nextDouble();
        System.out.println("Enter third number:");
        float thirdNumber = scan.nextFloat();
        if (thirdNumber > firstNumberInt &&  thirdNumber < secondNumberDouble )
            System.out.println(thirdNumber);
        else if (thirdNumber < firstNumberInt && thirdNumber > secondNumberDouble) {
            System.out.println(thirdNumber);
        }
        else System.out.println("The third number isn't between first and second.");
    }
}
