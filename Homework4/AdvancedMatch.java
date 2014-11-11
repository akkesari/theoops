// 
class AdvancedMatch implements ITournament{
	MatchData data;
	ITournament feeder1;
	ITournament feeder2;
	
	AdvancedMatch(MatchData data, ITournament feeder1, ITournament feeder2){
		this.data = data;
		this.feeder1 = feeder1;
		this.feeder2 = feeder2;
	}
	
}
