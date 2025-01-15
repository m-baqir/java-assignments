import javafx.scene.Node;

public class BinarySearchTree<T extends Comparable<T>> {
	private TreeNode<T> root;

	public BinarySearchTree() {
		root = null;
	} // end default constructor

	public BinarySearchTree(T rootItem) {
		root = new TreeNode<T>(rootItem, null, null);
	} // end constructor

	public void insert(T newItem) {
		root = insertItem(root, newItem);
	} // end insert

	public T retrieve(T searchKey) {
		return retrieveItem(root, searchKey);
	} // end retrieve

	public void delete(T searchKey) {
		root = deleteItem(root, searchKey);
	} // end delete

	private TreeNode<T> insertItem(TreeNode<T> tNode, T newItem) {
		if (tNode == null) {
			tNode = new TreeNode<>(newItem);
		} else if (newItem.compareTo(tNode.item) < 0) {
			// if newItem less, insert in left subtree
			tNode.leftChild = insertItem(tNode.leftChild, newItem);
		} else {
			// if newItem greater, insert in right subtree
			tNode.rightChild = insertItem(tNode.rightChild, newItem);
		}
		return tNode;
	} // end insertItem

	private T retrieveItem(TreeNode<T> tNode, T searchKey) {
		if (tNode == null) {
			// not found
			return null;
		} else if (searchKey.compareTo(tNode.item) < 0) {
			// if searchKey less, search the left
			return retrieveItem(tNode.leftChild, searchKey);
		} else if (searchKey.compareTo(tNode.item) > 0) {
			// if searchKey greater, search the right
			return retrieveItem(tNode.rightChild, searchKey);
		} else {
			return tNode.item;
		}
	} // end retrieveItem

	public TreeNode<T> deleteItem(TreeNode<T> tNode, T searchKey) {
		if (tNode == null) {
			// not found
			return null;
		}

		// compare the searchKey with the current
		int compResult = searchKey.compareTo(tNode.item);

		// search left subtree
		if (compResult < 0) {
			tNode.leftChild = deleteItem(tNode.leftChild, searchKey);
		}
		// search right subtree
		else if (compResult > 0) {
			tNode.rightChild = deleteItem(tNode.rightChild, searchKey);
		} else {
			// node with 0 or 1 child
			if (tNode.leftChild == null) {
				return tNode.rightChild;
			} else if (tNode.rightChild == null) {
				return tNode.leftChild;
			}

			// node with two children
			tNode.item = findMin(tNode.rightChild).item;
			tNode.rightChild = minDelete(tNode.rightChild);
		}

		return tNode;
	}// end deleteItem

	// method to find minimum node in a subtree
	private TreeNode<T> findMin(TreeNode<T> tNode) {
		while (tNode.leftChild != null) {
			tNode = tNode.leftChild;
		}
		return tNode;
	}

	// method to delete the minimum node in a subtree
	private TreeNode<T> minDelete(TreeNode<T> tNode) {
		if (tNode.leftChild == null) {
			return tNode.rightChild;
		}
		tNode.leftChild = minDelete(tNode.leftChild);
		return tNode;
	}

	public void setPreorder() {
		preorder(root);
	} // end setPreOrder

	public void setInorder() {
		inorder(root);
	} // end setInorder

	public void setPostorder() {
		postorder(root);
	} // end setPostorder

	private void preorder(TreeNode<T> treeNode) {
		if (treeNode != null) {
			System.out.print(treeNode.item + " ");
			preorder(treeNode.leftChild); // left subtree
			preorder(treeNode.rightChild); // right subtree
		}
	} // end preorder

	private void inorder(TreeNode<T> treeNode) {
		if (treeNode != null) {
			inorder(treeNode.leftChild); // left subtree
			System.out.print(treeNode.item + " ");
			inorder(treeNode.rightChild); // right subtree
		}
	} // end inorder

	private void postorder(TreeNode<T> treeNode) {
		if (treeNode != null) {
			postorder(treeNode.leftChild); // left subtree
			postorder(treeNode.rightChild); // right subtree
			System.out.print(treeNode.item + " ");
		}
	} // end postorder

} // end BinarySearchTree