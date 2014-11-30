import tester.*;

public class ExamplesADT {
	
	/*
	 * Contains all tests related to Stack methods: newStk, push, pop, top. 
	 * Notice that the outlined tests implicitly test for "push" since an error in said function
	 * would result in failures with all tests. 
	 */
	boolean testStack (Tester t){
		
		Stack forTopTest1 = (Stack) (new Stack()).push(1).push(2);
		
		return
				// Test if constructor creates an empty stack (newStk)
				t.checkExpect((new Stack()).isEmpty(), true) &&
				// If a single elt is added to stack return that (push, pop)
				t.checkExpect((new Stack()).push(1).top(), 1) &&
				// If two elements are added return the most recent one (push, top)
				t.checkExpect((new Stack()).push(1).push(2).top(), 2) &&
				// If same stack were popped then topped return the remaining element (push, pop, top)
				t.checkExpect((new Stack()).push(1).push(2).pop().top(), 1) &&
				// If same element added twice and stack popped delete only one of the two (push, pop, top)
				t.checkExpect((new Stack()).push(2).push(2).pop().top(), 2) &&
				// If top asked twice the same element should be returned (does not remove) (push, top)
				t.checkExpect(forTopTest1.top(), 2) &&
				t.checkExpect(forTopTest1.top(), 2);
	}
	
	/*
	 * Contains all tests related to Queue methods: newQ, enqueue, dequeue, front
	 */
	boolean testQueue(Tester t){
		
		Queue forFrontTest1 = (Queue) (new Queue()).enqueue(1).enqueue(2);
		
		return 
				// Test if constructor creates an empty stack (newQ)
				t.checkExpect((new Queue()).isEmpty(), true) &&
				// Test if enqueue actually adds elements and front reads them (enqueue, front)
				t.checkExpect((new Queue()).enqueue(1).front(), 1) &&
				// Test that dequeue actually removes an element (enqueue, dequeue)
				t.checkExpect((new Queue()).enqueue(1).dequeue().isEmpty(), true) &&
				// Test that if two elements are added front return the oldest (enqueue, front)
				t.checkExpect((new Queue()).enqueue(1).enqueue(2).front(), 1) &&
				// Just to be sure we werent lucky (enqueue, front)
				t.checkExpect((new Queue()).enqueue(1).enqueue(2).enqueue(-1).front(), 1) &&
				// If front asked twice same element should be returned (does not remove)
				t.checkExpect(forFrontTest1.enqueue(1).front(), 1) &&
				t.checkExpect(forFrontTest1.enqueue(1).front(), 1);
	}
	
}
