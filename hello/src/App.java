import java.util.Scanner;

public class App {
    static int factorial(){
        int i=1,fact=1;
        int num=5;
        while(i<=num){
            fact=fact*i;
            i++;
        }
         return fact;
    }
    public static void main(String[] args) throws Exception {
        int fact = factorial();        
        System.out.println("The factorial of 5 is "+ fact);
        Scanner myObj= new Scanner(System.in);
        System.out.println("enter value for n");        
        int n = myObj.nextInt();
        int sum = (n*(n+1))/2;
        System.out.print(sum);
        myObj.close();        
    }

    
}
