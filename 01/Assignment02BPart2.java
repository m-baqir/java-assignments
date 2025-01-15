import java.util.Scanner;

public class Assignment02BPart2 {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a numerator: ");
        int numerator = myObj.nextInt();
        System.out.print("Enter a denominator: ");
        int denominator = myObj.nextInt();
        if (denominator > numerator){
            System.out.println(numerator+" / "+denominator+" is a proper fraction");
        }
        else if (numerator >= denominator && numerator%denominator == 0){
            System.out.println(numerator+" / "+denominator+" is an improper fraction and it can be reduced to "+numerator/denominator);
        }
        else{
            System.out.println(numerator+" / "+denominator+" is an improper fraction and its mixed fraction is "+numerator/denominator+" + "+numerator%denominator+" / "+denominator);
        }

    }
}
