package Homework2;

import static java.lang.System.arraycopy;

public class Homework2Task5 {
    public static void main(String[] args) {
        int arrayOne[] = { 10, 12, 1, 8, 4 };
        int arrayTwo[] = new int[arrayOne.length];
        arrayTwo = arrayOne;
        System.out.println(" Array one has: ");
        for (int i = 0; i < arrayTwo.length; i++)
            System.out.print(arrayOne[i] + " ");

            System.out.println("\n\n Array two has: ");
        for (int i = 0; i < arrayTwo.length; i++)
            System.out.print(arrayTwo[i] + " ");
        }
}

