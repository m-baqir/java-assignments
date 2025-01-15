/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 9
Any and all work in this file is my own
 */
package COSC2006.Lab9;

public class Queue {
    protected SingleLinkedList queue;

    public Queue() {
        this.queue = new SingleLinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(String item) throws QueueException {
        try {
            queue.add(item, queue.size());
        } catch (ListException e) {
            throw new QueueException("error adding item to queue");
        }
    }

    public String dequeue() throws QueueException {
        try {
            return queue.remove(0);
        } catch (ListException e) {
            throw new QueueException("this queue is empty");
        }
    }

    public void dequeueAll() {
        this.queue.removeAll();
    }

    public String peek() throws QueueException {
        try {
            return queue.get(0);
        } catch (ListException e) {
            throw new QueueException("this queue is empty");
        }
    }

    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "Queue is empty";
        } else {
            String myString = "";
            for (int i = 0; i < this.size(); i++) {
                try {
                    myString += queue.get(i) + ", ";
                } catch (ListException e) {
                    System.err.println(e.getMessage());
                }
            }
            myString = myString.substring(0, myString.length() - 2);
            return myString;
        }
    }
}