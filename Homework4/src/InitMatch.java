// Original match
class InitMatch implements ITournament{
	MatchData data;
	
	InitMatch(MatchData data){
		this.data = data;
	}
	
	// Always returns true as it is a starting match
	public boolean winnerAlwaysAdvanced(){
		return true;
	}
	
	// Checks if venue is within capacity
	public boolean highCapacityVenue(int capacity){
		return this.data.venueCapacity() >= capacity;
	}
	
	public boolean allScoresValid(){
		return this.data.isScoreValid();
	}
	
	// Returns the winner
	public String getWinnerFromData(){
		return this.data.getWinnerName();
	}
}
