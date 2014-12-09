import tester.*;

public class Examples {
	Examples(){
		//String s1 = "tadpole";
		//System.out.println(s1.charAt(s1.length()));
	}
	
	LongestCommonSubsequence lcs = new LongestCommonSubsequence();
	
	boolean testLCS(Tester t){
		return
				t.checkExpect(lcs.lcs("abd", "abd"), "abd") &&
				t.checkExpect(lcs.lcs("donkey", "over"), "oe") &&
				t.checkExpect(lcs.lcs("tadpole", "hamburguer"), "ae") &&
				t.checkExpect(lcs.lcs("tadpolealkansdcasdl", "hamburguerlkasnckadsnaksdcn"), "aelkascasd") &&
				t.checkExpect(lcs.lcs("abd", "abdt"), "abd");
	}
}

