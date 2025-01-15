import java.util.Scanner;

public class Test1PartB {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int num1=myObj.nextInt();
        int num2=myObj.nextInt();
        int num3=myObj.nextInt();
        int max1 = Math.max(num2, num3);
        int max2 = Math.max(max1, num1);
        System.out.println("You entered the following numbers "+ num1+" "+num2+" "+num3);
        System.out.println("The maximum of these numbers is "+max2);
    }
}
