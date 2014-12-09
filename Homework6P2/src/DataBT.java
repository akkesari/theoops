class DataBT<T extends Comparable<T>> {
	T data;
	IBinTree<T> left;
	IBinTree<T> right;

	DataBT(T data, IBinTree<T> left, IBinTree<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	// determines whether this node or node in subtree has given element
	public boolean hasElt(T data) {
		return this.data == data || this.left.hasElt(data) || this.right.hasElt(data) ;
	}

	// adds 1 to the number of nodes in the left and right subtrees
	public int size() {
		return 1 + this.left.size() + this.right.size();
	}

	// adds 1 to the height of the taller subtree
	public int height() {
		return 1 + Math.max(this.left.height(), this.right.height());
	}
}