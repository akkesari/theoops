// Keeps score of soccer match
class SoccerScore implements IScore {
	int goals1;
	int goals2;
	boolean usedExtraTime;
	
	//Constructor
	SoccerScore(int goals1, int goals2, boolean usedExtraTime){
		this.goals1 = goals1;
		this.goals2 = goals2;
		this.usedExtraTime = usedExtraTime;
	}
	
	// True if the score is valid: "if the two teams have the same number
	// of goals, extra time had to have been played."
	public boolean isValid(){
		if (goals1 == goals2)
				return usedExtraTime;
		return true;
	}
	
	// Returns the winner
	public boolean getWinner(){
		return this.goals1 > this.goals2;
	}
}
