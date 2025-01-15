/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 8
Any and all work in this file is my own
 */
package COSC2006.Lab8;

import java.util.Scanner;

public class ReverseStringTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String myInput = myScanner.nextLine();
        try {
            CharStack myStack = new CharStack(myInput.length());

            for (char c : myInput.toCharArray()) {
                myStack.push(c);
            }

            System.out.print("Reversed String: ");
            while (!myStack.isEmpty()) {
                System.out.print(myStack.pop());
            }
        } catch (StackException ex) {
            System.err.println(ex.getMessage());
        } finally {
            myScanner.close();
        }
    }
}
