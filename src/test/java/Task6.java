import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Specifying day number
        System.out.println("Enter a number from 1 to 7:");
        Scanner scan = new Scanner(System.in);
        int dayNumber = scan.nextInt();
        String dayString="";
        //Switch statement
        switch(dayNumber){
            //case statements within the switch block
            case 1: dayString="Monday";
                break;
            case 2: dayString="Thuesday";
                break;
            case 3: dayString="Wednesday";
                break;
            case 4: dayString="Thirsday";
                break;
            case 5: dayString="Friday";
                break;
            case 6: dayString="Saturday";
                break;
            case 7: dayString="Sunday";
                break;

            default:System.out.println("Invalid number!");
        }
        System.out.println(dayString);
    }
}

