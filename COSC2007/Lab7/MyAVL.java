class MyAVL {
    Node root;

    // Method to get the height of a node
    public int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    // Method to get the balance factor of a node
    public int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    // Method to perform a right rotation on a subtree rooted at node
    public Node rightRotate(Node node) {
        Node leftChild = node.left;
        Node rightChildOfLeftChild = leftChild.right;

        // Perform the rotation
        leftChild.right = node;
        node.left = rightChildOfLeftChild;

        // Update the heights of the nodes
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        leftChild.height = Math.max(getHeight(leftChild.left), getHeight(leftChild.right)) + 1;

        // Return the new root of the subtree
        return leftChild;
    }

    // Method to perform a left rotation on a subtree rooted at node
    public Node leftRotate(Node node) {
        Node rightChild = node.right;
        Node leftChildOfRightChild = rightChild.left;

        // Perform the rotation
        rightChild.left = node;
        node.right = leftChildOfRightChild;

        // Update the heights of the nodes
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        rightChild.height = Math.max(getHeight(rightChild.left), getHeight(rightChild.right)) + 1;

        // Return the new root of the subtree
        return rightChild;
    }

    // Method to insert a new element in the AVL tree
    public Node insert(Node node, int item) {
        // If the node is empty, create a new node and return it
        if (node == null) {
            return new Node(item);
        }
        // If the item is less than the item of the node, insert it in the left subtree
        if (item < node.item) {
            node.left = insert(node.left, item);
            // If the item is greater than the item of the node, insert it in the right
            // subtree
        } else if (item > node.item) {
            node.right = insert(node.right, item);
            // If the item is equal to the item of the node, return the node
        } else {
            return node;
        }

        // Update the height of the node
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;

        // Get the balance factor of the node
        int balance = getBalance(node);

        // If the node is unbalanced, perform one of the four cases of rotation

        // Left Left Case
        if (balance > 1 && item < node.left.item) {
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && item > node.right.item) {
            return leftRotate(node);
        }

        // Left Right Case
        if (balance > 1 && item > node.left.item) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && item < node.right.item) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Return the unchanged node
        return node;
    }

    // Method to print the preorder traversal of the tree
    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.item + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
