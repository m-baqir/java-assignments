/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 8
Any and all work in this file is my own
 */
package COSC2006.Lab8;

import java.util.Scanner;

public class TestParentheses {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a string with parentheses: ");
        String inputString2 = myScanner.nextLine();
        try {
            CharStack myStack = new CharStack(inputString2.length());

            boolean balance = true;

            for (char c : inputString2.toCharArray()) {
                if (c == '(') {
                    myStack.push(c);
                } else if (c == ')') {
                    if (myStack.isEmpty()) {
                        balance = false;
                        break;
                    } else {
                        myStack.pop();
                    }
                }
            }
            if (!myStack.isEmpty()) {
                balance = false;
            }

            if (balance) {
                System.out.println("The parentheses are balanced.");
            } else {
                System.out.println("The parentheses are not balanced.");
            }
        } catch (StackException ex) {
            System.err.println(ex.getMessage());
        } finally {
            myScanner.close();
        }
    }
}
