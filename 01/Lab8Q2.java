import java.util.Scanner;

public class Lab8Q2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = myObj.nextInt();
        System.out.println("Enter number of columns");
        int columns = myObj.nextInt();
        int[][] myArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                double face = Math.random();
                if (face > 0.5)
                    myArray[i][j] = 1;
                else
                    myArray[i][j] = 0;
            }
        }

        for (int i = 0; i < rows; i++) {
            int zero = 0, one = 0;
            for (int j = 0; j < columns; j++) {
                if (myArray[i][j] == 0)
                    zero++;
                else
                    one++;
            }
            System.out.println("The number of 1's in row " + (i + 1) + " is " + one);
            System.out.println("The number of 0's in row " + (i + 1) + " is " + zero);
        }

        for (int k = 0; k < columns; k++) {
            int zero = 0, one = 0;
            for (int l = 0; l < rows; l++) {
                if (myArray[k][l] == 0)
                    zero++;
                else
                    one++;
            }
            System.out.println("The number of 1's in column " + (k + 1) + " is " + one);
            System.out.println("The number of 0's in column " + (k + 1) + " is " + zero);
        }

        for (int m = 0; m < rows; m++) {
            for (int n = 0; n < columns; n++) {
                System.out.print(myArray[m][n] + "  ");
            }
            System.out.println();
        }
    }
}
