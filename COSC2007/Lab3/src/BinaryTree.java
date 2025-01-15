class BinaryTree {
    Node root;
    //constructor for new binary tree. initialize to null
    BinaryTree() {
        root = null;
    }
    //method for inorder traversal
    void inOrder(Node root) {
        if (root != null) {
            //left first then right traversal
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }
}