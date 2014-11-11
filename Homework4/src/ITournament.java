// Takes care of methods for other classes in tournament
interface ITournament {
	boolean winnerAlwaysAdvanced();
	boolean highCapacityVenue(int capcaity);
	boolean allScoresValid();
	
	// Returns the winner
	String getWinnerFromData();
}
