// Keeps track of the data for a match
class MatchData {
	String contestant1;
	String contestant2;
	IScore score;
	Venue matchVenue;
	
	// Constructor
	MatchData(String contestant1, String contestant2, IScore score, Venue matchVenue){
		this.contestant1 = contestant1;
		this.contestant2 = contestant2;
		this.score = score;
		this.matchVenue = matchVenue;
	}
	
	// Returns the capacity of the venue
	int venueCapacity(){
		return this.matchVenue.capacity;
	}
}
