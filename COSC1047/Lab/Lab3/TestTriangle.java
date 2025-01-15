package Lab3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTriangle extends Triangle {
    public static void main(String[] args) throws IOException {
        try {
            File myObj = new File("sides.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter myWriter = new FileWriter("sides.txt");
            for (int i = 1; i < 4; i++) {
                myWriter.write((int) Math.floor(Math.random() * (10 - 1 + 1) + 1) + " ");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

            int[] myNumbers = new int[3];
            int count = 0;
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextInt()) {
                myNumbers[count] = myReader.nextInt();
                count++;
            }
            myReader.close();
            Triangle myTriangle = new Triangle(myNumbers[0], myNumbers[1], myNumbers[2]);
            System.out.println(myTriangle.getPerimeter());

        } catch (IllegalTriangleException e) {
            System.out.println("IllegalTriangleException: The triangle cannot be created.");
        }

    }
}
