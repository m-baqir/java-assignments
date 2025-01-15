import java.util.Scanner;

public class Assignment02BPart1 {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double userx = myObj.nextDouble();
        double usery = myObj.nextDouble();
        double xlimit = 5;
        double ylimit = 2.5;
        if (userx <= xlimit && usery <= ylimit){
            System.out.print("Point ("+userx+", "+usery+") is in the rectangle");
        }
        else{
            System.out.print("Point ("+userx+", "+usery+") is not in the rectangle");
        }
    }
}
