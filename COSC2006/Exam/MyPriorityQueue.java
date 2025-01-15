package COSC2006.Exam;

import java.util.PriorityQueue;

public class MyPriorityQueue {

    private PriorityQueue<String> priorityQueue;

    public MyPriorityQueue() {
        this.priorityQueue = new PriorityQueue<>();
    }

    public void addItem(String item) {
        priorityQueue.add(item);
    }

    public void removeItem(String item) {
        priorityQueue.remove(item);
    }

    public void printItems() {
        for (String item : priorityQueue) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        MyPriorityQueue test = new MyPriorityQueue();

        // Add elements to the PriorityQueue
        test.addItem("Apple");
        test.addItem("Banana");
        test.addItem("Cherry");

        // Remove 'Banana'
        test.removeItem("Banana");

        // Print the remaining elements
        test.printItems();
    }
}
