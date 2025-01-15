
import java.util.Scanner;

public class Lab8Q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of columns");
        int columns = myObj.nextInt();
        int[][] table = new int[columns][columns];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j] = (int) (Math.random() * (1000 - 1)) + 1;
            }
        }
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(table[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.println("The average of all values in the matrix is: " + average(table));
        System.out.println("The sum of all values in the matrix is: " + sum(table));
        System.out.println("The largest value in the matrix is: " + largest(table));
        System.out.println("The smallest value in the matrix is: " + smallest(table));
        int mode = mode(table);
        if (mode == table[0][0])
            System.out.println("The mode of the matrix does not exist because there are no repeating values");
        else
            System.out.println("The mode of the matrix is: " + mode(table));
    }

    public static int average(int[][] arr) {
        int runtotal = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                runtotal += arr[i][j];
                count++;
            }
        }
        int avg = runtotal / count;
        return avg;
    }

    public static int sum(int[][] arr) {
        int runtotal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                runtotal += arr[i][j];
            }
        }
        return runtotal;
    }

    public static int largest(int[][] arr) {
        int large = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                if (value > large)
                    large = value;
            }
        }
        return large;
    }

    public static int smallest(int[][] arr) {
        int small = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                if (value < small)
                    small = value;
            }
        }
        return small;
    }

    public static int mode(int[][] arr) {
        int[] sample = new int[1001];
        int common = -1;
        int mostFrequent = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                sample[value]++;

                if (sample[value] > mostFrequent) {
                    common = value;
                    mostFrequent = sample[value];
                }
            }
        }
        return common;
    }
}
