import java.util.Scanner;

public class Lab5Q1 {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the set size?");
        int size = myObj.nextInt();
        System.out.print("Enter the set: ");
        int runtotal=0, sumsquare=0;
        for (int i=1;i<=size;i++){
            int num = myObj.nextInt();
            runtotal+=num;
            sumsquare+=(num*num);
        }
        double mean = runtotal/size;
        System.out.println("The mean of this set is "+mean);
        double variance = ((size*sumsquare)-(runtotal*runtotal))/(size*size);
        double stdev = Math.sqrt(variance);
        System.out.println("The standard deviation of this set is "+stdev);
    }
}
