import java.util.Scanner;

public class Lab4 {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String string = myObj.nextLine();
        System.out.println("Enter the second string:");
        String subString = myObj.nextLine();
        String result = (string.contains(subString)) ? (subString + " is a substring of " + string) : (subString + " is not a substring of " + string);
        System.out.println(result);
    }
}
