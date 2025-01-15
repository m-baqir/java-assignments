/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 9
Any and all work in this file is my own
 */
package COSC2006.Lab9;

public class QueueTest {

    public static void main(String[] args) throws QueueException {
        Queue queue = new Queue();
        try {
            queue.enqueue("Inam");
            System.out.println(queue.toString());
            queue.enqueue("Mike");
            System.out.println(queue.toString());
            queue.enqueue("Joe");
            System.out.println(queue.toString());
            queue.enqueue("Ali");
            System.out.println(queue.toString());
            queue.enqueue("Mohammad");
            System.out.println(queue.toString());
            queue.enqueue("Fraser");
            System.out.println(queue.toString());
            queue.enqueue("Tyson");
            System.out.println(queue.toString());
            queue.enqueue("David");
            System.out.println(queue.toString());
            queue.enqueue("Smith");
            System.out.println(queue.toString());
            queue.enqueue("Donna");
            System.out.println(queue.toString());

            System.out.println("Remove: " + queue.dequeue());
            System.out.println(queue.toString());
            System.out.println("Remove: " + queue.dequeue());
            System.out.println(queue.toString());
            System.out.println("Remove: " + queue.dequeue());
            System.out.println(queue.toString());
            System.out.println("Remove: " + queue.dequeue());
            System.out.println(queue.toString());
            System.out.println("Remove: " + queue.dequeue());
            System.out.println(queue.toString());
        } catch (QueueException ex) {
            System.err.println(ex.getMessage());
        }

    }

}