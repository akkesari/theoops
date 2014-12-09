class MtHeap<T extends Comparable<T>> implements IHeap<T> {
	MtHeap(){}

	// Since a MtHeap is empty, it does not have the element
	public boolean hasElt(T t) {
		return false;
	}

	// A MtHeap has a size of 0
	public int size() {
		return 0;
	}

	// A MtHeap has a height of 0
	public int height() {
		return 0;
	}

	// If you add an element to a MtHeap, you create a new DataHeap
	public IHeap<T> addElt(T t) {
		return (IHeap<T>) new DataHeap<T>(t, new MtHeap<T>(), new MtHeap<T>());
	}

	// The min element of an empty heap returns an empty heap.
	public IHeap<T> remMinElt() {
		return null;
	}

	// An empty heap should always lose a competition for which root is smaller (for the merge function)
	public boolean isBigger(T t) {
		return true;
	}

	// An empty heap merged with another heap is the other heap (identity).
	public IHeap<T> merge(IHeap<T> withHeap) {
		return withHeap;
	}
	
	public T findMinElt(){
		return null;
	}
}