/*
 * Signatures for Graph class
 * 
 * @author Paulo Carvalho; Anurag Kesari
 * @Version 1.0
 */
public interface IGraph {
	/*
	 * Adds a node to the graph
	 * 
	 * @param cityname String of the city name
	 * @return Node that was created
	 */
	Node newNode(String cityName);
	
	/*
	 * Creates an edge between two nodes in the graph
	 * 
	 * @param node1 One of the nodes in the connection
	 * @param node2 The other node in the connection
	 */
	void addEdge(Node node1, Node node2);
	
	/*
	 * Returns true if there is path between the two given nodes (1 hop)
	 * 
	 * @param node1 One of the nodes in test
	 * @param ndoe2 The other node in the test
	 * @return Boolean True if there is an edge between the two nodes
	 */
	boolean hasDirectRoute(Node node1, Node node2);
	
	/*
	 * Return true if there is a path between two nodes (any number of hops)
	 * 
	 * @param node1 One of the nodes in test
	 * @param ndoe2 The other node in the test
	 * @return Boolean True if there is a path between two nodes
	 */
	boolean hasRoute(Node node1, Node node2);
}
