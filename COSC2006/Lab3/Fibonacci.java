/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 3
Any and all work in this file is my own
 */
package COSC2006.Lab3;

import java.util.Scanner;

class Fibonacci {
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = myScanner.nextInt();
        System.out.println(fib(input));
        myScanner.close();
    }
}
