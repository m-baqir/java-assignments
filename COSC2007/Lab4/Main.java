public class Main {

	public static void main(String[] args) {
		BSTree<Integer> bst = new BSTree<Integer>(3);
		// Insert nodes
		bst.insert(8);
		bst.insert(1);
		bst.insert(4);
		bst.insert(6);
		bst.insert(2);
		bst.insert(10);
		bst.insert(9);
		bst.insert(20);
		bst.insert(25);
		bst.insert(15);
		bst.insert(16);

		// Call inorder traversal to display the tree elements in increasing order
		System.out.println("Display elements in increasing order: ");
		bst.setInorder();
		System.out.println("\n");
		// retrieve 4
		System.out.println("Retrieve 4:");
		System.out.println(bst.retrieve(4));
		System.out.println();
		// delete 2
		System.out.println("Delete 2:");
		bst.delete(2);
		System.out.println("Inorder traversal: ");
		bst.setInorder();
		System.out.println();
		System.out.println();
		// delete 4
		System.out.println("Delete 4:");
		bst.delete(4);
		System.out.println("Inorder traversal: ");
		bst.setInorder();
		System.out.println();
		System.out.println();
		// delete 10
		System.out.println("Delete 10:");
		bst.delete(10);
		System.out.println("Inorder traversal: ");
		bst.setInorder();
		System.out.println("\nMohammad Baqir");
	}
}