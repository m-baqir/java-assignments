/**
 * @author Mohammad Baqir
 * @version 1.0.0
 */
import java.util.Scanner;

public class Assignment3Part2 {
    public static void main(String[] args){
        double sale = 0;
        System.out.println("Enter sales commission");
        //scanner object
        Scanner myObj = new Scanner(System.in);
        //get commission
        double commission = myObj.nextDouble();
        //calculate sale based on commission and tier rates
        if (commission > 0 && commission <=400){
            sale = commission/0.08;
        }
        else if (commission > 401 && commission <=900){
            sale = ((commission-400) / 0.1) + 5000;
        }
        else if (commission > 900){
            sale = ((commission-900) / 0.12) + 10000;
        }
        //output final message
        System.out.println("The sales ammount $"+sale+" is needed to make a commission of $"+commission);
    }
}
