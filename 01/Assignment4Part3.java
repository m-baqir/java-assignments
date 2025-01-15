import java.util.Scanner;

public class Assignment4Part3 {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        //get number from scanner
        int num = myObj.nextInt();
        //main loop for creating rows
        for (int a = 1; a <= num; a++) {
            //add spaces before the numbers
            for (int b = 1; b <= num - a; b++) {
              System.out.print("  ");
            }
    
            //print increasing numbers from 1 to num
            for (int c = 1; c <= a; c++) {
              System.out.print(c + " ");
            }
    
            //print decreasing numbers from num-1 down to 1
            for (int d = a - 1; d >= 1; d--) {
              System.out.print(d + " ");
            }
    
            //next line
            System.out.println();
    
        }
    }
}
