import tester.*;

/*
 * Instantiates the LCS and runs test cases on it
 * 
 * @author Paulo Carvalho; Anurag Kesari
 * @Version 1.0
 */
public class Examples {
	
	/*
	 * Constructor
	 * 
	 * @param none
	 * @return none
	 */
	Examples(){
		//String s1 = "tadpole";
		//System.out.println(s1.charAt(s1.length()));
	}
	
	// Create an instance of the LCS
	LongestCommonSubsequence lcs = new LongestCommonSubsequence();
	
	/*
	 * Runs different test cases for the LCS
	 * 
	 * @param t is an instance of Tester
	 * @return boolean if test passed or suceeded
	 */
	boolean testLCS(Tester t){
		return
				t.checkExpect(lcs.lcs("abd", "abd"), "abd") &&
				t.checkExpect(lcs.lcs("donkey", "over"), "oe") &&
				t.checkExpect(lcs.lcs("tadpole", "hamburguer"), "ae") &&
				t.checkExpect(lcs.lcs("000", "0000"), "000") &&
				t.checkExpect(lcs.lcs("asdfghjkl", "asdfghjkl"), "asdfghjkl") &&
				t.checkExpect(lcs.lcs(
						"Therecolor is giraff a hidden on message","There isplss a hiddentaw message"),
						"There is a hidden message") &&
				t.checkExpect(lcs.lcs("tadpolealkansdcasdl", "hamburguerlkasnckadsnaksdcn"), "aelkascasd") &&
				t.checkExpect(lcs.lcs("abd", "abdt"), "abd");
	}
}

