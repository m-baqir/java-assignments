package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class IllegalTempException extends Exception {
    public IllegalTempException(String s) {
        super(s);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();

        try {
            Scanner myReader = new Scanner("temps.txt");
            while (myReader.hasNextInt()) {
                if (myReader.nextInt() < 10 || myReader.nextInt() > 30) {
                    throw new IllegalTempException("invalid");
                } else {
                    System.out.println(myReader.nextInt());
                    myArray.add(myReader.nextInt());
                }
            }
            myReader.close();
        } catch (IllegalTempException e) {
            System.out.println("IllegalTempException: The temperature must be between 10 and 30.");
        }
    }
}
