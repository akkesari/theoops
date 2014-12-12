import java.util.LinkedList;

/*
 * Defines a node data type. Has a name and list of nodes that it can access
 * 
 * @author Paulo Carvalho; Anurag Kesari
 * @Version 1.0
 */
public class Node {
	String cityName;
	LinkedList<Node> connections;
	
	/*
	 * Constructor
	 * 
	 * @param cityName The name of the city as a string
	 */
	Node(String cityName){
		this.cityName = cityName;
		this.connections = new LinkedList<Node>();
	}
	
	/*
	 * Adds a node to the list of connections
	 * 
	 * @param connection Node to which this one should connect
	 */
	public void addEdge(Node connection){
		this.connections.add(connection);
	}
	
	/*
	 * Returns true if there is a connection between this node and the given node (1 hop)
	 * 
	 * @param node Node to which a connection is being tested
	 * @return Boolean Is there a connection?
	 */
	public boolean hasDirectRoute(Node node){
		if (this == node)
			return true;
		for (Node n: connections){
			if (n.equals(node))
				return true;
		}
		return false;
	}
	
	/*
	 * Returns true if there is a route between this node and the given node
	 * 
	 * @param node Node to which a route is being tested
	 * @return Boolean Is there a route?
	 */
	public boolean hasRoute(Node node, LinkedList<Node> visited){
		if (this == node)
			return true;
		else if (visited.contains(this))
			return false;
		else 
			visited.add(this);
		for (Node n: connections){
			if (n.hasRoute(node, visited))
				return true;
		}
		return false;
	}
	
	
}
