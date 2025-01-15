package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TotalAverage {
    public static void main(String[] args) {
        int count = 0, runtotal = 0;
        try {
            File myObj = new File("Scores.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextInt()) {
                int num = myReader.nextInt();
                runtotal += num;
                count++;
            }
            myReader.close();
            System.out.println("The total is: " + runtotal);
            System.out.println("The average is: " + runtotal / count);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
