
class SwimmingScore implements IScore{
	int time1;
	int time2;
	
	SwimmingScore(int time1, int time2){
		this.time1 = time1;
		this.time2 = time2;
	}
	
	public boolean hasBetterRanking(){
		return true; // TODO WRITE THIS HERE
	}
	
	public String winner(IContestant contestant1, IContestant contestant2){
		if (this.time1 <= this.time2){
			return contestant1.getName();
		}
		else{
			return contestant2.getName();
		}
	}
}
