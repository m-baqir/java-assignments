public class Main {
    public static void main(String[] args) {
        // Create an empty AVL tree
        MyAVL tree = new MyAVL();

        // Insert the elements 10, 20, 30, 40, 50, and 25
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        // Print the preorder traversal of the tree
        System.out.println("Preorder traversal of the AVL tree:");
        tree.preOrder(tree.root);
        System.out.println("\njohn");
    }
}
