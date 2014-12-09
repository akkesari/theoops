interface IBinTree<T extends Comparable<T>> {
	// determines whether element is in the tree
	boolean hasElt(T t);
	// returns number of nodes in the tree; counts duplicate elements as separate items
	int size();
	// returns depth of longest branch in the tree
	int height();
}