// 
class AdvancedMatch implements ITournament {
	MatchData data;
	ITournament feeder1;
	ITournament feeder2;
	
	AdvancedMatch(MatchData data, ITournament feeder1, ITournament feeder2){
		this.data = data;
		this.feeder1 = feeder1;
		this.feeder2 = feeder2;
	}
	
	public boolean winnerAlwaysAdvanced(){
		return (feeder1.getWinnerFromData().equals(this.data.contestant1) ||
			   feeder1.getWinnerFromData().equals(this.data.contestant2)) &&
			   (feeder2.getWinnerFromData().equals(this.data.contestant1) ||
		       feeder2.getWinnerFromData().equals(this.data.contestant2));
	}
	
	// Returns if the venue had more people than expected
	public boolean highCapacityVenue(int capacity){
		return this.data.venueCapacity() >= capacity ||
			   feeder1.highCapacityVenue(capacity) ||
			   feeder2.highCapacityVenue(capacity);
	}
	
	// 
	public boolean allScoresValid(){
		return this.data.isScoreValid() && feeder1.allScoresValid() && feeder2.allScoresValid();
	}
	
	// Returns the winner
	public String getWinnerFromData(){
		return this.data.getWinnerName();
	}
}
