// Keeps the results of a baseball match
class BaseballScore extends AbstractITeam{
	int runs1;
	int runs2;
	int innings;
	boolean rainShortened;
	
	BaseballScore(int runs1, int runs2, int innings, boolean rainShortened){
		this.runs1 = runs1;
		this.runs2 = runs2;
		this.innings = innings;
		this.rainShortened = rainShortened;
	}
	
	// True if the score is valid: "if the game was shortened by rain, at least 
	// 5 innings must have been played. For games that were not shortened by 
	// rain, at least 9 innings must have been played. In addition, for a 
	// baseball score to be valid, the game may not end in a tie score."
	public boolean isValid() {
		if (rainShortened)
			return innings >= 5 && runs1 != runs2;
		return innings >= 9 && runs1 != runs2;	
	}
	
	// Returns the winner
	public boolean getWinner(){
		return this.runs1 > this.runs2;
	}

}
