import java.util.Random;

class DataHeap<T extends Comparable<T>> extends DataBT<T> implements IHeap<T> {
	IHeap<T> left;
	IHeap<T> right;
	//T data;

	DataHeap(T data, IHeap<T> left, IHeap<T> right) {
		super (data, left, right);
		this.left = left;
		this.right = right;
	}

	public IHeap<T> merge(IHeap<T> withHeap) {
		T newRoot;
		IHeap<T> H1, H2, H3;

		// determine the new root value and the three subtrees to consider merging
		if (withHeap.isBigger(this.data)) {
			newRoot = this.data;
			H1 = (IHeap<T>) this.left;
			H2 = (IHeap<T>) this.right;
			H3 = withHeap;
		} else {
			// Since a MtHeap will always return true on isBigger, satisfying
			//  the first condition, we know that withHeap is a DataHeap.
			//  Therefore, we can cast it.
			newRoot = ((DataHeap<T>) withHeap).data;
			H1 = ((DataHeap<T>) withHeap).left;
			H2 = ((DataHeap<T>) withHeap).right;
			H3 = this;
		}

		// choose which trees to merge and construct the new tree
		if (H1.height() > H2.height() && H1.height() > H3.height()) {
			return new DataHeap<T> (newRoot, H1, H2.merge (H3));
		} else if (H2.height() > H1.height() && H2.height() > H3.height()) {
			return new DataHeap<T> (newRoot, H2, H1.merge (H3));
		} else if (H3.height() > H1.height() && H3.height() > H2.height()){
			return new DataHeap<T> (newRoot, H3, H1.merge (H2));
		} else {
			// If the two bigger heaps are of the same size, choose one at random.
			Random coinFlip = new Random();
			if (H1.height() == H2.height()) {
				if (coinFlip.nextInt() % 2 == 1) {
					return new DataHeap<T> (newRoot, H1, H2.merge(H3));
				} else {
					return new DataHeap<T> (newRoot, H2, H1.merge(H3));
				}
			} else if (H2.height() == H3.height()) {
				if (coinFlip.nextInt() % 2 == 1) {
					return new DataHeap<T> (newRoot, H2, H3.merge(H1));
				} else {
					return new DataHeap<T> (newRoot, H3, H2.merge(H1));
				}
			} else {
				if (coinFlip.nextInt() %2 == 1) {
					return new DataHeap<T> (newRoot, H3, H1.merge(H2));
				} else {
					return new DataHeap<T> (newRoot, H1, H3.merge(H2));
				}
			}
		}
	}


	public IHeap<T> addElt(T t) {
		return this.merge(new DataHeap<T>(t, new MtHeap<T>(), new MtHeap<T>()));
	}
	
	public IHeap<T> remMinElt() {
		return this.right.merge(this.left);
	}

	public boolean isBigger(T t) {
		return (this.data.compareTo(t) > 0);
	}
	
	public T findMinElt(){
		return this.data;
	}
}