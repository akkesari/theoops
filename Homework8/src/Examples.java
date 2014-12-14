import java.util.LinkedList;

import tester.Tester;
/*
 * Instantiates all classes and methods in program to provide example of functionality and testing
 * 
 * @author Paulo Carvalho; Anurag Kesari
 * @Version 1.0
 */
public class Examples {
	// Declare nodes to be in scope of class
	Node a; Node b; Node c; Node d; Node e;
	Node f; Node g; Node h; Node i; Node j;
	Node k; Node l; Node m; Node n; Node o; Node p;
	
	// Create graph
	Graph graph;
	
	/*
	 * Empty constructor
	 */
	Examples(){
		initGraph();
	}
	
	/*
	 * Initializes all nodes and graph
	 * 
	 * @param none
	 */
	void initGraph(){
		/*
		 * View of Graph: 3 Subsets (A-I; J-L; M-P)
		 * 
		 * 		A	-	B	   C	-	D			J 	- 	K 	- 	L
		 * 		  \	  /	  \	 /	 \	   /
		 * 			E		F    	G				M	-	N	-	P
		 * 					|	  /					  \   /
		 * 					H   /						O
		 * 					| /
		 * 					I
		 */
		// Initialize Graph
		graph = new Graph();
		
		// Add nodes to graph
		a = graph.newNode("a"); b = graph.newNode("b"); c = graph.newNode("c"); d = graph.newNode("d");
		e = graph.newNode("e"); f = graph.newNode("f"); g = graph.newNode("g"); h = graph.newNode("h");
		i = graph.newNode("i"); j = graph.newNode("j"); k = graph.newNode("k"); l = graph.newNode("l");
		m = graph.newNode("m"); n = graph.newNode("n"); o = graph.newNode("o"); p = graph.newNode("p");
		
		// Add edges in graph
		// Subset 1
		graph.addEdge(a, b); graph.addEdge(a, e); graph.addEdge(b, e);
		graph.addEdge(b, f); graph.addEdge(f, c); graph.addEdge(c, d);
		graph.addEdge(c, g); graph.addEdge(g, d); graph.addEdge(f, h);
		graph.addEdge(h, i); graph.addEdge(i, g);
		
		// Subset 2
		graph.addEdge(j, k); graph.addEdge(k, l);
		
		// Subset 3
		graph.addEdge(m, n); graph.addEdge(m, o); graph.addEdge(n, p);
		graph.addEdge(n, o);
	}
	
	/*
	 * Tests the methods in Node. Test for addEdge is implicit.
	 * 
	 * @param none
	 */
	boolean testNode(Tester t){
		return
				t.checkExpect(graph.hasDirectRoute(a, b), true) && // Direct Paths to test construction
				t.checkExpect(graph.hasDirectRoute(a, e), true) &&
				t.checkExpect(graph.hasDirectRoute(b, f), true) &&
				t.checkExpect(graph.hasDirectRoute(f, b), true) &&
				t.checkExpect(graph.hasDirectRoute(f, b), true) &&
				t.checkExpect(graph.hasDirectRoute(m, n), true) &&
				t.checkExpect(graph.hasDirectRoute(o, n), true) &&
				t.checkExpect(graph.hasDirectRoute(m, p), false) &&
				t.checkExpect(graph.hasDirectRoute(k, l), true) &&
				
				t.checkExpect(graph.hasRoute(a, d), true) && // Indirect Paths (Multiple hops)
				t.checkExpect(graph.hasRoute(i, b), true) &&
				t.checkExpect(graph.hasRoute(h, d), true) && 
				t.checkExpect(graph.hasRoute(j, l), true) &&
				t.checkExpect(graph.hasRoute(o, p), true) &&
				t.checkExpect(graph.hasRoute(i, o), false) && 
				t.checkExpect(graph.hasRoute(f, k), false) && 
				t.checkExpect(graph.hasRoute(p, l), false);
				
	}
	
	/*
	 * Test getNetworks method and its associated methods
	 * 
	 * @param none
	 */
	boolean testGetNetworks(Tester t){
		LinkedList<Node> tempList1 = new LinkedList<Node>(); // Subset 1 as Nodes
		tempList1.add(a); tempList1.add(b); tempList1.add(c); tempList1.add(d);
		tempList1.add(e); tempList1.add(f); tempList1.add(g); tempList1.add(h);  tempList1.add(i);
		LinkedList<String> tempList1r = new LinkedList<String>(); // Subset 1 as Strings
		tempList1r.add("a"); tempList1r.add("b"); tempList1r.add("c"); tempList1r.add("d");
		tempList1r.add("e"); tempList1r.add("f"); tempList1r.add("g"); tempList1r.add("h");  tempList1r.add("i");
		LinkedList<String> tempList2 = new LinkedList<String>(); // Subset 2 as Strings
		tempList2.add("j"); tempList2.add("k"); tempList2.add("l"); 
		LinkedList<String> tempList3 = new LinkedList<String>(); // Subset 3 as Strings
		tempList3.add("m"); tempList3.add("n"); tempList3.add("o"); tempList3.add("p"); 
		
		LinkedList<Network> networks = this.graph.getNetworks();
		// Print result
		for (Network n: networks)
			System.out.println(n.getCities());
		
		return
				t.checkExpect((new Network()).getNetwork(tempList1).getCities(), tempList1r) &&
				t.checkExpect(networks.get(0).getCities(), tempList1r) &&
				t.checkExpect(networks.get(1).getCities(), tempList2) &&
				t.checkExpect(networks.get(2).getCities(), tempList3);
	}
}



		