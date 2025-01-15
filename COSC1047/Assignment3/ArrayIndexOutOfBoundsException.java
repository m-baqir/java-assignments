package Assignment3;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] myNumbers = new int[101];
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < myNumbers.length; i++) {
            int num = rand.nextInt(101);
            myNumbers[i] = num;
        }
        System.out.println("Enter index of the array:");
        int userNum = myObj.nextInt();
        if (userNum > 100)
            System.out.println("Out of Bounds");
        else
            System.out
                    .println("Corresponding element value at index " + userNum + " is equal to " + myNumbers[userNum]);
    }
}
