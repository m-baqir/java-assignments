/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 6
Any and all work in this file is my own
 */
package COSC2006.Lab6;

public class SingleLinkedList {
    private SingleNode head;

    public SingleLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int counter = 0;
        SingleNode myNode = head;
        while (myNode != null) {
            counter++;
            myNode = myNode.next;
        }
        return counter;
    }

    public void add(String item, int i) throws ListException {
        if (i < 0 || i > size()) {
            throw new ListException("Index out of bounds");
        }
        if (i == 0) {
            head = new SingleNode(item, head);
        } else {
            SingleNode present = head;
            for (int j = 0; j < i - 1; j++) {
                present = present.next;
            }
            present.next = new SingleNode(item, present.next);
        }
    }

    public String remove(int i) throws ListException {
        if (i < 0 || i >= size()) {
            throw new ListException("Index out of bounds");
        }
        String removedItem;
        if (i == 0) {
            removedItem = head.item;
            head = head.next;
        } else {
            SingleNode myNode = head;
            for (int j = 0; j < i - 1; j++) {
                myNode = myNode.next;
            }
            removedItem = myNode.next.item;
            myNode.next = myNode.next.next;
        }
        return removedItem;
    }

    public void removeAll() {
        head = null;
    }

    public String get(int i) throws ListException {
        if (i < 0 || i >= size()) {
            throw new ListException("Index out of bounds");
        }
        SingleNode myNode = head;
        for (int j = 0; j < i; j++) {
            myNode = myNode.next;
        }
        return myNode.item;
    }

    public int find(String item) {
        SingleNode myNode = head;
        int index = 0;
        while (myNode != null) {
            if (myNode.item.equals(item)) {
                return index;
            }
            myNode = myNode.next;
            index++;
        }
        return -1;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "List is empty";
        } else {
            String result = "";
            SingleNode myNode = head;
            while (myNode != null) {
                result += myNode.item + " -> ";
                myNode = myNode.next;
            }
            result = result.substring(0, result.length() - 4);
            result += " -> null";
            return result;
        }
    }
}
