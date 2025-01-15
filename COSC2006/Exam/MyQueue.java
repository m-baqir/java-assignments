package COSC2006.Exam;

import java.util.LinkedList;

public class MyQueue<T> {

    private LinkedList<T> myList;

    public MyQueue() {
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
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.dequeue();
        boolean before = myQueue.isEmpty();
        int removed = myQueue.dequeue();
        boolean after = myQueue.isEmpty();

        // Output
        System.out.println("isEmptyBefore = " + before);
        System.out.println("dequeued = " + removed);
        System.out.println("isEmptyAfter = " + after);
    }
}
