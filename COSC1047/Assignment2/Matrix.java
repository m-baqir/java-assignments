import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arraySize = myObj.nextInt();
        int[][] arr = new int[arraySize][arraySize];
        // fill matrix with random
        System.out.println("The random array is");
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                double rand = Math.random();
                if (rand > 0.5)
                    arr[i][j] = 1;
                else
                    arr[i][j] = 0;
            }
        }
        // print matrix
        for (int m = 0; m < arraySize; m++) {
            for (int n = 0; n < arraySize; n++) {
                System.out.print(arr[m][n] + "  ");
            }
            System.out.println();
        }
        // declare arraylists
        ArrayList<Integer> columns = new ArrayList<Integer>();
        ArrayList<Integer> rows = new ArrayList<Integer>();
        // counting 1s and finding max values of rows
        int max = 0;
        for (int c = 0; c < arr.length; c++) {
            int count = 0;
            for (int d = 0; d < arr[c].length; d++) {
                if (arr[c][d] == 1) {
                    count++;
                }
            }
            if (max < count) {
                max = count;
                rows.clear();
                rows.add(c);
            } else if (max == count) {
                rows.add(c);
            }
        }
        // counting 1s and finding max values of columns
        int max2 = 0;
        for (int e = 0; e < arr.length; e++) {
            int counter = 0;
            for (int f = 0; f < arr[e].length; f++) {
                if (arr[f][e] == 1) {
                    counter++;
                }
            }
            if (max2 < counter) {
                max2 = counter;
                columns.clear();
                columns.add(e);
            } else if (max2 == counter) {
                columns.add(e);
            }
        }
        // print index of largest rows
        System.out.print("The largest row index: ");
        for (int g = 0; g < rows.size(); g++) {
            System.out.print(rows.get(g) + " ");
        }
        // print index of largest columns
        System.out.print("\nThe largest column index: ");
        for (int h = 0; h < columns.size(); h++) {
            System.out.print(columns.get(h) + " ");
        }
    }
}
