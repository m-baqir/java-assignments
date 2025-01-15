/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 3
Any and all work in this file is my own
 */
package COSC2006.Lab3;

import java.util.Scanner;

public class Printing {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = myScanner.nextInt();
        printDown(input);
        printUp(input);
        myScanner.close();
    }

    public static void printDown(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            printDown(n - 1);
        }
    }

    public static void printUp(int n) {
        if (n > 0) {
            printUp(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
