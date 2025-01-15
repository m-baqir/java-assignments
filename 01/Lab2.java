import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
    double investment, rate, result;
    int years;
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter the investment amount:");
    investment = myObj.nextDouble();
    System.out.println("Please enter the monthly interest rate:");
    rate = myObj.nextDouble();
    System.out.println("Please enter the number of years:");
    years = myObj.nextInt();
    rate++;
    result = investment*Math.pow(rate, years);
    System.out.println("The future value of the investment is: " + result);
    System.out.println();
    System.out.println();
    /* Scanner myObj = new Scanner(System.in);
    int int1, int2;
    System.out.println("Enter the first integer value:");
    int1 = myObj.nextInt();
    System.out.println("Enter the second integer value:");
    int2 = myObj.nextInt();
    System.out.println("Sum of values: " + (int1+int2));
    System.out.println("Difference of the values: " + (int1-int2));
    System.out.println("Product of the values: " + (int1*int2));
    System.out.println("Quotient of the values: " + (int1/int2));
    System.out.println();
    System.out.println();
    double dbl1, dbl2;
    System.out.println("Enter the first double value:");
    dbl1 = myObj.nextDouble();
    System.out.println("Enter the second double value:");
    dbl2 = myObj.nextDouble();
    System.out.println("Sum of values: " + (dbl1+dbl2));
    System.out.println("Difference of the values: " + (dbl1-dbl2));
    System.out.println("Product of the values: " + (dbl1*dbl2));
    System.out.println("Quotient of the values: " + (dbl1/dbl2)); */
  }
}
