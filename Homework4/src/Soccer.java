class Soccer extends AbstractITeam implements IRanked{
	
	Soccer(String teamName, int numPlayers, String captain, int ranking){
		super(teamName, numPlayers, captain);
	}

	public boolean hasBetterRanking() {
		// TODO Auto-generated method stub
		return false;
	}

}
