/*
 * Stores the key for the hasmap
 * 
 * @author Paulo Carvalho; Anurag Kesari
 * @Version 1.0
 */
public class TheKey {
	int a;
	int b;
	
	/*
	 * Constructor
	 */
	public TheKey(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	/*
	 * Equals method for the HashMap
	 * 
	 * @param object for hasmap
	 * @return boolean
	 */
	public boolean equals(Object obj){
		if (obj instanceof TheKey){
			return this.a == ((TheKey)obj).a &&
					this.b == ((TheKey)obj).b;
		}
		
		return false;
	}
	
	/*
	 * Creates the key for the HashMap
	 * 
	 * Makes use of a bijective mapping with the Cantor Pairing Function
	 * 
	 * @param none
	 * @return int
	 */
	public int hashCode(){
		int sum = this.a + this.b;
		return (sum) * (sum + 1) / 2 + this.a;
	}
	
}
