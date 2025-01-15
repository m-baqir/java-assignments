public class Main {
    public static void main(String args[]) {
        //create new binary tree
        BinaryTree tree = new BinaryTree();
        //insert numbers 1-15 in the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        tree.root.right.left.left = new Node(12);
        tree.root.right.left.right = new Node(13);
        tree.root.right.right.left = new Node(14);
        tree.root.right.right.right = new Node(15);
        //output
        System.out.println("Inorder traversal of binary tree is: ");
        tree.inOrder(tree.root);
        System.out.println("\nMohammad Baqir");
    }
}
