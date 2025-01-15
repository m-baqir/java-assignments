package Lab2;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter three sides of the triangle: ");
        Triangle myTri = new Triangle(myObj.nextDouble(), myObj.nextDouble(), myObj.nextDouble());
        System.out.println("Enter a color: ");
        myTri.setColor(myObj.nextLine());
        System.out.println("Is the triangle filled? ");
        myTri.setFilled(myObj.nextBoolean());
        System.out.println("The perimeter is " + myTri.getPerimeter());
        System.out.println(myTri.toString());
    }
}
