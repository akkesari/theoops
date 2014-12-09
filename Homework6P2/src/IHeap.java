interface IHeap<T extends Comparable<T>> extends IBinTree<T> {
	// adds given element to the heap without removing other elements
	IHeap<T> addElt(T t);
	
	// removes one occurrence of the smallest element from the heap
	IHeap<T> remMinElt();
	
	// Merge the current heap with another heap
	IHeap<T> merge(IHeap<T> withHeap);
	
	// Determine if the root of this heap is bigger than the given element
	boolean isBigger(T t);
	
	// Find the smallest element in the heap
	T findMinElt();
}