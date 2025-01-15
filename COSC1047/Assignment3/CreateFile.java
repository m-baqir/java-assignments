package Assignment3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> myInt = new ArrayList<Integer>();
        try {
            File myObj = new File("Exercise12_15.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter myWriter = new FileWriter("Exercise12_15.txt");
            for (int i = 0; i < 101; i++) {
                int num = rand.nextInt(101);
                myWriter.write(num + " ");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextInt()) {
                myInt.add(myReader.nextInt());
            }
            myReader.close();
            Collections.sort(myInt);
            System.out.println(myInt);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
