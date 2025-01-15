/**
Lab 1 excercise 2
COSC2007
Student: Mohammad Baqir
Student number: 239330870
Write a program to convert prefix into postfix expression
Pesudocode:
get the string of the expression
use the stack library to push and pop characters of the string to move them around.
read the expression from right to left
push the operators on stack to keep them separate
when an operator is encountered, it is popped and then pushed on the stack so that it is at the end of the expression
 */
package COSC2007;

import java.util.Stack;

public class Lab1ex2 {
    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    static String prefixToPostfix(String prefix) {
        Stack<String> myStack = new Stack<>();
        int length = prefix.length();
        for (int i = length - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            if (isOperator(c)) {
                String op1 = myStack.pop();
                String op2 = myStack.pop();
                String temp = op1 + op2 + c;
                myStack.push(temp);
            } else {
                myStack.push(c + "");
            }
        }
        return myStack.pop();
    }

    public static void main(String[] args) {
        String myPrefix = "+A(*BC)";
        System.out.println("Prefix Expression: " + myPrefix);
        System.out.println("Postfix Expression: " + prefixToPostfix(myPrefix));
    }
}
