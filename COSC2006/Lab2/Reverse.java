/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 2
Any and all work in this file is my own
 */
package COSC2006.Lab2;

import java.util.Scanner;

public class Reverse {
    public static void reverse(int number) {
        // if single digit number negative or positive
        if (number >= -9 && number <= 9) {
            System.out.print(Math.abs(number));
            // print minus sign
            if (number < 0) {
                System.out.print("-");
            }
        } else {
            // if number bigger then single digit do mod10
            System.out.print(Math.abs(number) % 10);
            // recurse for remaning numbers
            reverse(Math.abs(number) / 10);
            // print minus sign
            if (number < 0) {
                System.out.print("-");
            }
        }
    }

    // driver code
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = myScanner.nextInt();
        reverse(input);
    }
}