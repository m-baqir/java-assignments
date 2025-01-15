/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 8
Any and all work in this file is my own
 */
package COSC2006.Lab8;

public class CharStack {
    private char[] myArray;
    private int stackTop;

    public CharStack(int size) throws StackException {
        if (size <= 0) {
            throw new StackException("Stack size must be greater than zero");
        }
        myArray = new char[size];
        stackTop = -1;
    }

    public boolean isEmpty() {
        return stackTop == -1;
    }

    public void push(char item) throws StackException {
        if (stackTop == myArray.length - 1) {
            throw new StackException("Stack overflow");
        }
        myArray[++stackTop] = item;
    }

    public char pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return myArray[stackTop--];
    }

    public void popAll() {
        stackTop = -1;
    }

    public char peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return myArray[stackTop];
    }
}
