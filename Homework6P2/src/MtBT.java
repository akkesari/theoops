class MtBT<T> {
	MtBT(){}

	// returns false since empty tree has no elements
	boolean hasElt(T t) {
		return false;
	}

	// returns 0 since enpty tree has no elements
	int size() {
		return 0;
	}

	// returns 0 since empty tree has no branches
	int height() {
		return 0;
	}
}
