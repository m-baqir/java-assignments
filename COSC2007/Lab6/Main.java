public class Main {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue(9);
        // Add elements to the priority queue
        queue.add(45);
        queue.add(20);
        queue.add(14);
        queue.add(12);
        queue.add(31);
        queue.add(7);
        queue.add(11);
        queue.add(13);
        queue.add(7);
        // Display the elements in the priority queue
        System.out.println("Display elements: ");
        queue.display();
        // Display the element with maximum priority
        System.out.println("\nDisplay the node with maximum priority: ");
        System.out.println(queue.getMax());
        // Display the priority queue after extracting max
        System.out.println("Display the priority queue after extracting max: ");
        queue.extractMax();
        queue.display();
        // Display the priority queue after changing the priority of element at index 2
        // to 49
        System.out.println("\nChange the priority of element at index 2 to 49 and display the elements: ");
        queue.changePriorityAtIndex(2, 49);
        queue.display();
        // Display the priority queue after removing the element at index 3
        System.out.println("\nRemove the element at index 3 and display the elements: ");
        queue.remove(3);
        queue.display();
        System.out.println("\nMohammad Baqir");
    }
}
