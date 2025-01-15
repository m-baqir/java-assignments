public class DriverBST {

	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(15);
		// Insert nodes
		bst.insert(5);
		bst.insert(16);
		bst.insert(3);
		bst.insert(12);
		bst.insert(20);
		bst.insert(10);
		bst.insert(13);
		bst.insert(18);
		bst.insert(23);
		bst.insert(6);
		bst.insert(7);

		// Call preorder, inorder, and postorder traversals
		System.out.println("Preorder traversal: ");
		bst.setPreorder();
		System.out.println();
		System.out.println("Inorder traversal: ");
		bst.setInorder();
		System.out.println();
		System.out.println("Postorder traversal: ");
		bst.setPostorder();
		System.out.println("\n");
		System.out.println("Delete 13:");
		bst.delete(13);
		// Call preorder, inorder, and postorder traversals
		System.out.println("Preorder traversal: ");
		bst.setPreorder();
		System.out.println();
		System.out.println("Inorder traversal: ");
		bst.setInorder();
		System.out.println();
		System.out.println("Postorder traversal: ");
		bst.setPostorder();
		System.out.println("\n");
		System.out.println("Delete 16:");
		bst.delete(16);
		// Call preorder, inorder, and postorder traversals
		System.out.println("Preorder traversal: ");
		bst.setPreorder();
		System.out.println();
		System.out.println("Inorder traversal: ");
		bst.setInorder();
		System.out.println();
		System.out.println("Postorder traversal: ");
		bst.setPostorder();
		System.out.println("\n");
		System.out.println("Delete 5:");
		bst.delete(5);
		// Call preorder, inorder, and postorder traversals
		System.out.println("Preorder traversal: ");
		bst.setPreorder();
		System.out.println();
		System.out.println("Inorder traversal: ");
		bst.setInorder();
		System.out.println();
		System.out.println("Postorder traversal: ");
		bst.setPostorder();

	} // end main
}