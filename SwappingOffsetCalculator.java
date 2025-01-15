
//this method of calculation was found at https://www2.cs.uregina.ca/~anima/330/Notes/memory/paging.html
import java.util.Scanner;

public class SwappingOffsetCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int addressReference;
        int pgSize;

        System.out.print("Enter the page size in Kb: ");
        pgSize = myScanner.nextInt() * 1024;
        System.out.print("Enter the address reference: ");
        addressReference = myScanner.nextInt();

        System.out.println("Offset = " + addressReference + " % " + pgSize + " = " + (addressReference % pgSize));
        System.out.println("Page = " + addressReference + " / " + pgSize + " = " + (addressReference / pgSize));
    }
}