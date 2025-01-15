package COSC2006.Exam;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> myList;

    public Queue() {
        this.myList = new LinkedList<>();
    }

    public void enqueue(T element) {
        myList.addLast(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot remove. Queue is empty");
        }
        return myList.removeFirst();
    }

    public boolean isEmpty() {
        return myList.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.enqueue("apple");
        myQueue.enqueue("banana");
        boolean empty = myQueue.isEmpty();
        String frontElement = myQueue.dequeue();

        // Output
        System.out.println("isEmpty = " + empty);
        System.out.println("dequeued = " + frontElement);
    }
}
