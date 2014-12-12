import java.util.LinkedList;
/*
 * Graph class
 * 
 * @author Paulo Carvalho; Anurag Kesari
 * @Version 1.0
 */
public class Graph implements IGraph{
	// List of nodes in the graph
	LinkedList<Node> nodes;
	
	/*
	 * Constructor
	 * 
	 * @param none
	 */
	Graph(){
		this.nodes = new LinkedList<Node>();
	}
	
	/*
	 * (non-Javadoc)
	 * @see IGraph#newNode(java.lang.String)
	 */
	public Node newNode(String cityName) {
		Node tempNode = new Node(cityName);
		this.nodes.add(tempNode);
		return tempNode;
	}
	
	/*
	 * (non-Javadoc)
	 * @see IGraph#addEdge(Node, Node)
	 */
	public void addEdge(Node node1, Node node2) {
		node1.addEdge(node2);
		node2.addEdge(node1);
	}
	
	/*
	 * (non-Javadoc)
	 * @see IGraph#hasDirectRoute(Node, Node)
	 */
	public boolean hasDirectRoute(Node node1, Node node2){
		return node1.hasDirectRoute(node2);
	}

	/*
	 * (non-Javadoc)
	 * @see IGraph#hasRoute(Node, Node)
	 */
	public boolean hasRoute(Node node1, Node node2) {
		
		return node1.hasRoute(node2, new LinkedList<Node>());
	}
	
	
}
