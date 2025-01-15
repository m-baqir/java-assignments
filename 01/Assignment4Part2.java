import java.util.Scanner;

public class Assignment4Part2 {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a positive number");
        //get number from user
        int n = myObj.nextInt();
        //check for negative number
        while (n<0){
            System.out.println("Invalid number. Please Enter a positive number!!!!!!!");
            n = myObj.nextInt();
        }
        //loop through and calculate
        while (n != 1){
            if (n%2 == 0){
                n=(n/2);
            }
            else{
                n=(3*n+1);
            }
            System.out.print(n+" ");
        }
    }
}
