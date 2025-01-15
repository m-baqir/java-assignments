/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 7
Any and all work in this file is my own
 */
package COSC2006.Lab7;

public class SingleSortedLinkedList {
    private SingleNode head;

    public SingleSortedLinkedList() {
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

    public void add(String item) throws ListException {
        if (item == null) {
            throw new ListException("String item is null");
        }
        SingleNode myNode = new SingleNode(item);

        if (isEmpty() || item.compareTo(head.item) < 0) {
            myNode.next = head;
            head = myNode;
        } else {
            SingleNode present = head;

            while (present.next != null && item.compareTo(present.next.item) > 0) {
                present = present.next;
            }

            myNode.next = present.next;
            present.next = myNode;
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
