// Keeps score of soccer match
class SoccerScore implements IScore{
	int goals1;
	int goals2;
	boolean usedExtraTime;
	
	//Constructor
	SoccerScore(int goals1, int goals2, boolean usedExtraTime){
		this.goals1 = goals1;
		this.goals2 = goals2;
		this.usedExtraTime = usedExtraTime;
	}
	

	public boolean hasBetterRanking() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String winner(IContestant contestant1, IContestant contestant2){
		if (this.goals1 <= this.goals2){
			return contestant2.getName();
		}
		else
			return contestant1.getName();
	}
}
