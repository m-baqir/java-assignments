/**
 * @author Mohammad Baqir
 * @version 1.0.0
 */
import java.util.Scanner;

public class Assignment3 {
    public static void main (String[] args){
        //create variables
        double rate1 = 0.08;
        double rate2 = 0.1;
        double rate3 = 0.12;
        double result = 0.0, runtotal = 0.0;
        System.out.println("Enter sales amount");
        //scanner object
        Scanner myObj = new Scanner(System.in);
        //get sales amount from user
        double amount = myObj.nextDouble();
        //number of iterations for loop in 5000 increments
        int iterations = (int)amount/5000;
        //for loop to calculate rates with different tiers
        for (int i=1;i<=iterations;i++){
            if (i==1){
            result = 5000*rate1;
            }
            if (i==2){
                result = 5000*rate2;
            }
            if (i>=3){
                result = (amount-10000)*rate3;
            }
            runtotal+=result;
        }
        //final output statement
        System.out.println("the commission is "+runtotal+" for sales amount of "+amount);

    }
}
