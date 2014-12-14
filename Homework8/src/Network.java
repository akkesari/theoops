import java.util.LinkedList;
/*
 * Keeps a list of subgraphs - aka networks
 * 
 * @author Paulo Carvalho; Anurag Kesari
 * @Version 1.0
 */
public class Network {
	LinkedList<String> cities;
	
	/*
	 * Constructor
	 */
	Network(){
		this.cities = new LinkedList<String>();
	}
	
	/*
	 * Returns a list of nodes in the given network
	 * 
	 * @param none
	 * @return LinkedList<Node> 
	 */
	Network getNetwork(LinkedList<Node> visited){
		for (Node n: visited){
			this.cities.add(n.cityName);
		}
		
		return this;
	}
	
	/*
	 * Returns the list of cities
	 * 
	 * @param none
	 * @return List of cities as a string
	 */
	LinkedList<String> getCities(){
		return this.cities;
	}
}
