import java.util.Scanner;

public class Lab6Part2 {
public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int object = 0;
    int calc = 0;
    while (true) { 
        System.out.println("Choose a shape (1) triangle, (2) square, (3) circle: ");
        object = myObj.nextInt();
        if (object == 1 || object == 2 || object == 3)
            System.out.println("Choose a calculation (1) perimeter, (2)area: ");
        calc = myObj.nextInt();
        if (calc == 1 || calc == 2)
            break;
        else 
            System.out.println("not a valid selection, please pick again");
    }
    objectCalculator(object, calc);
}
public static void objectCalculator(int obj, int calcType) {
    Scanner myObj = new Scanner(System.in);
    double area = 0;
    double peri = 0;
    String object = "";
        if (obj == 1 && calcType == 1) {
            System.out.println("Enter 3 side lengths:");
            double triangle1 = myObj.nextDouble();
            double triangle2 = myObj.nextDouble();
            double triangle3 = myObj.nextDouble();
            peri = triangle1 + triangle2 + triangle3;
            object = "triangle";
        } 
        else if (obj == 1 && calcType == 2) {
            System.out.println("Enter base and height");
            double base = myObj.nextDouble();
            double height = myObj.nextDouble();
            area = (base * height) / 2;
            object = "triangle";
        } 
        else if (obj == 2 && calcType == 1) {
            System.out.println("Enter 1 side length");
            double square = myObj.nextDouble();
            peri = square * 4;
            object = "square";
        }
        else if (obj == 2 && calcType == 2) {
            System.out.println("Enter 1 side length");
            double square = myObj.nextDouble();
            area = Math.pow(square, 2);
            object = "square";
        }
        else if (obj == 3 && calcType == 1) {
            System.out.println("Enter the radius");
            double radius = myObj.nextDouble();
            peri = 2 * Math.PI * radius;
            object = "circle";
        }
        else {
            System.out.println("Enter the radius");
            double radius = myObj.nextDouble();
            area = Math.PI * Math.pow(radius, 2);
            object = "circle";
        }
        if (calcType == 2)
            System.out.println("The area of the " +object+ " is " +area);    
        else 
            System.out.println("The perimeter of the " +object+ " is " +peri);            
    }
}