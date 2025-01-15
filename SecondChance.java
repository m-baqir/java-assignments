import java.util.Scanner;

/**
 * Represents a node in a linked list.
 */
class Node {
    int value;
    Node next;

    /**
     * Constructs a new node with the given value.
     * 
     * @param value the value of the node
     */
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

/**
 * Represents a circular linked list.
 */
class myLinkedList {
    private Node head;
    private int size;

    /**
     * Constructs a new circular linked list with the given size.
     * 
     * @param size the size of the circular linked list
     */
    public myLinkedList(int size) {
        this.size = size;
        this.head = null;
    }

    /**
     * Initializes the linked list with random values (0 or 1).
     */
    public void insertRandomValues() {
        Node current = null;
        for (int i = 0; i < size; i++) {
            int randValue = (int) (Math.random() * 2); // 0 or 1
            Node newNode = new Node(randValue);
            if (head == null) {
                head = newNode;
                current = head;
            } else {
                current.next = newNode;
                current = newNode;
            }
        }
        current.next = head;
    }

    /**
     * Prints the values of the linked list.
     */
    public void printLinkedList() {
        Node current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * Performs the second chance algorithm on the linked list.
     * 
     * @param victimIndex the index of the victim node
     */
    public void executeSecondChance(int victimIndex) {
        Node current = head;
        for (int i = 0; i < victimIndex; i++) {
            current = current.next;
        }
        while (current.value == 1) {
            current.value = 0; // Give the victim a second chance
            current = current.next;
        }
        current.value = 1; // Fill the victim
    }
}

/**
 * The main class for the Second Chance algorithm.
 */
public class SecondChance {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the size of the linked list: ");
        int size = myScanner.nextInt();
        if (size < 20 || size > 30) {
            System.out.println("Invalid size. enter a size between 20 and 30.");
            return;
        }

        myLinkedList linkedlist = new myLinkedList(size);
        linkedlist.insertRandomValues();
        System.out.print("Initial linked list: ");
        linkedlist.printLinkedList();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the index of the next victim (0-" + (size - 1) + "): ");
            int victimIndex = myScanner.nextInt();
            if (victimIndex < 0 || victimIndex >= size) {
                System.out.println("Invalid index. enter a valid index.");
                i--;
                continue;
            }
            linkedlist.executeSecondChance(victimIndex);
            System.out.println("Updated linked list after victim " + victimIndex + ": ");
            linkedlist.printLinkedList();
        }
    }
}
