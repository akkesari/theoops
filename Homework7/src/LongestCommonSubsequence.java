import java.util.HashMap;

/*
 * Determines the longest common subsequence between two strings. Contain all supporting methods.
 * 
 * @author Paulo Carvalho; Anurag Kesari
 * @Version 1.0
 */
public class LongestCommonSubsequence {
	
	String s1;
	String s2;
	
	private HashMap<TheKey, String> memtab = new HashMap<TheKey, String>();
	
	/*
	 * Constructor
	 * 
	 * @param none
	 * @return none
	 */
	public LongestCommonSubsequence(){
		
	}
	
	/*
	 * Saves the strings and calls helper method
	 * 
	 * @param string1 First string
	 * @param string2 Second string
	 * @return lcs String that corresponds to lcs
	 */
	public String lcs(String string1, String string2){
		this.s1 = string1;
		this.s2 = string2;
		
		// Clean memoizer!
		memtab.clear();
		
		return lcsHelper(0,0);
	}
	
	/*
	 * Recursive method for returning the LCS
	 * 
	 * @param s1Pos Current cursor position in string 1
	 * @param s2Pos Current cursor positions in string 2
	 */
	String lcsHelper(int s1Pos, int s2Pos){
		// Check if this prompt has been previously computed
		TheKey key = new TheKey(s1Pos, s2Pos);
		if (memtab.containsKey(key))
			return memtab.get(key);
		// Limit program to size of strings
		if (s1Pos >= s1.length() || s2Pos >= s2.length())
			return "";
		// If either string has length 0 return ""
		if (this.s1.length() == 0 || this.s2.length() == 0)
			return "";
		// Return first character if both match
		else if (this.s1.charAt(s1Pos) == this.s2.charAt(s2Pos)){
			String result = this.s1.charAt(s1Pos) + lcsHelper(s1Pos+1,s2Pos+1);
			memtab.put(key, result);
			return result;
		}
		// Branch by removing first character of either string. Keep largest
		else {
			String temp1 = lcsHelper(s1Pos, s2Pos+1);
			String temp2 = lcsHelper(s1Pos+1, s2Pos);
			
			String result = (temp1.length() > temp2.length()) ? temp1 : temp2;
			memtab.put(key, result);
			
			return result;
		}
	}
	
	

}
