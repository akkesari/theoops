
class SwimmingScore extends AbstractIRanked{
	int time1;
	int time2;
	
	SwimmingScore(int time1, int time2){
		this.time1 = time1;
		this.time2 = time2;
	}
	
	public boolean hasBetterRanking(){
		return true; // TODO WRITE THIS HERE
	}
}
