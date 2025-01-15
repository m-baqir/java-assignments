// Node class to store the item and height of each node
public class Node {
    int item;
    int height;
    Node left;
    Node right;

    // Constructor to create a new node
    public Node(int item) {
        this.item = item;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
}