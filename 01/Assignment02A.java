import java.util.Scanner;

public class Assignment02A {
    public static void main (String[] args){
        System.out.println("Enter five numbers separated by a space");
        //start scanner
        Scanner myObj = new Scanner(System.in);
        //get values of 5 numbers
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        int num3 = myObj.nextInt();
        int num4 = myObj.nextInt();
        int num5 = myObj.nextInt();
        //get square root and cube root values
        double num1sqrt = Math.sqrt(num1);
        double num1cubrt = Math.cbrt(num1);
        double num2sqrt = Math.sqrt(num2);
        double num2cubrt = Math.cbrt(num2);
        double num3sqrt = Math.sqrt(num3);
        double num3cubrt = Math.cbrt(num3);
        double num4sqrt = Math.sqrt(num4);
        double num4cubrt = Math.cbrt(num4);
        double num5sqrt = Math.sqrt(num5);
        double num5cubrt = Math.cbrt(num5);
        //use printf to create and display table
        System.out.printf("%-10s %-10s %4s %n", "Number", "Square Roots", "Cube Roots");
        System.out.printf("%-13s  %-10.1f %-10.1f %n",num1,num1sqrt,num1cubrt);
        System.out.printf("%-13s  %-10.3f %-10.3f %n",num2,num2sqrt,num2cubrt);
        System.out.printf("%-13s  %-10.3f %-10.3f %n",num3,num3sqrt,num3cubrt);
        System.out.printf("%-13s  %-10.1f %-10.3f %n",num4,num4sqrt,num4cubrt);
        System.out.printf("%-13s  %-10.3f %-10.3f %n",num5,num5sqrt,num5cubrt);
    }
}
