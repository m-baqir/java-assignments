import java.util.Scanner;

public class Assignment4 {
    public static void main (String[] args){
        //scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Type initial investment:");
        System.out.print("Initial Investment = ");
        //get initial investment
        double initialinvest = myObj.nextDouble();
        System.out.print("Initial Rate = ");
        //get rate
        double rate = (myObj.nextDouble())/100;
        System.out.println("=======================\n");
        //table headings
        System.out.printf("%-10s %-10s %4s %n", "Year", "Interest", "Value");
        double interest = 0,add=0;
        //go through loop and calculate and display
        for (int i=1;i<=5;i++){
            interest = initialinvest*rate;
            initialinvest+=interest;
            System.out.printf("%-9s  %-10.3f %-10.3f %n",i,interest,initialinvest);
        }
    }
}
