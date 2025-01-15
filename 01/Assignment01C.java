/**
 * program for calculating the hypotenuse
 * @version 1.0.0
 * @author Mohammad Baqir
 * @param a,b
 * @return value of hypotenuse as a formatted double
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment01C {
    public static void main (String[] args){
        int a,b;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Pick two random numbers between 0 and 6 for base and height of a right angle triangle");
        //user input
        a=myObj.nextInt();
        b=myObj.nextInt();
        //convert to double
        double dbla = a;
        double dblb = b;
        //calculate math
        double result = Math.sqrt((Math.pow(dbla, 2))+(Math.pow(dblb, 2)));
        //output
        System.out.println("The hypotenuse is: " + DecimalFormat.getInstance().format(result));

    }
}
