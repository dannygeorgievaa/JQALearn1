import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
       // int workHours;
       // double amountMoney;
      //  boolean isItWorkDay;

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the working hours (int number):");
        int workHours = scan.nextInt();

        System.out.println("Type the amount of money thay you have (double number):");
        double amountMoney = scan.nextDouble();

        System.out.println("Is it day a work day today");
        boolean isItWorkDay = scan.nextBoolean();

        if (isItWorkDay == true){
            System.out.println("Today I'm gonna work.");
        }
        else if(isItWorkDay == false && amountMoney > 10 ){
            System.out.println("I'm going to Cinema today.");
        } 
        else if (amountMoney == 0.0 && isItWorkDay == false) {
            System.out.println("Im'm goint to stay at home and watch television.");
        }
        else if (isItWorkDay == false && (amountMoney > 0.0 && amountMoney<=10.0) ) {
            System.out.println("I'm going for an ice cream.");
        }
    }
}
