public class Main {

	public static void main(String[] args) {
		BSTree<Integer> bst = new BSTree<Integer>();
		// Insert nodes
		bst.insert(45);
		bst.insert(10);
		bst.insert(7);
		bst.insert(90);
		bst.insert(12);
		bst.insert(50);
		bst.insert(13);
		bst.insert(39);
		bst.insert(57);

		// Call inorder traversal to display the tree elements in increasing order
		System.out.println("Display elements inorder: ");
		bst.setInorder();
		System.out.println("\nMohammad Baqir");
	}
}