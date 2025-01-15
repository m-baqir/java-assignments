public class TreeNode<T> {
	private T small;
	private T large;
	TreeNode<T> leftChild;
	TreeNode<T> rightChild;
	TreeNode<T> middleChild;
	TreeNode<T> parent;
	TreeNode<T> temp;

	public TreeNode() {
		// no-arg constructor
		this.small = null;
		this.large = null;
		this.leftChild = null;
		this.rightChild = null;
		this.middleChild = null;
		this.parent = null;
		this.temp = null;
	} // end constructor

	public TreeNode(T small) {
		// Initializes tree node with a small item and no children.
		this.small = small;
		this.large = null;
		this.leftChild = null;
		this.rightChild = null;
		this.middleChild = null;
		this.parent = null;
		this.temp = null;
	} // end constructor

	public TreeNode(T small, T large) {
		// Initializes tree node with a small and a large items and no children.
		this.small = small;
		this.large = large;
		this.leftChild = null;
		this.rightChild = null;
		this.middleChild = null;
		this.parent = null;
		this.temp = null;
	} // end constructor

	public TreeNode(T small, T large, TreeNode<T> leftChild, TreeNode<T> rightChild, TreeNode<T> middleChild,
			TreeNode<T> parent, TreeNode<T> temp) {
		this.small = small;
		this.large = large;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.middleChild = middleChild;
		this.parent = parent;
		this.temp = temp;
	} // end constructor

	public T getSmallItem() {
		return small;
	}

	public void setSmallItem(T small) {
		this.small = small;
	}

	public T getLargeItem() {
		return large;
	}

	public void setLargeItem(T large) {
		this.large = large;
	}

	public TreeNode<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	public TreeNode<T> getMidChild() {
		return middleChild;
	}

	public void setMidChild(TreeNode<T> middleChild) {
		this.middleChild = middleChild;
	}

	public TreeNode<T> getParentNode() {
		return parent;
	}

	public void setParentNode(TreeNode<T> parent) {
		this.parent = parent;
	}

	public TreeNode<T> getTempChild() {
		return temp;
	}

	public void setTempChild(TreeNode<T> temp) {
		this.temp = temp;
	}
} // end TreeNode