// Provides example classes their instances and runs tests
class Examples {
	Examples(){
		
	}
	/******************** Create Soccer Tournament **********************/
	
	// SAMn: Soccer Advanced Match n; SIMn: Soccer Init Match n
	//			      sIM1
	//			    /
	//		   sAM1 - sIM2
	//	sAM3 <
	//		   sAM2 - sIM3
	//			    \
	//			      sIM4
	
	// Create examples of Soccer Teams
	Soccer soccerTeam1 = new Soccer("The Loosers", 11, "The Lost One", 1);
	Soccer soccerTeam2 = new Soccer("The Squirrels", 15, "The Candid One", 2);
	Soccer soccerTeam3 = new Soccer("The Looms", 16, "The Ignored One", 3);
	Soccer soccerTeam4 = new Soccer("The Winners", 13, "The Other One", 4);
	Soccer soccerTeam5 = new Soccer("The Loosers 2", 11, "The Crazy One", 1);
	Soccer soccerTeam6 = new Soccer("The Squirrels 2", 15, "The Wet One", 2);
	Soccer soccerTeam7 = new Soccer("The Looms 2", 16, "The Dry One", 3);
	Soccer soccerTeam8 = new Soccer("The Winners 2", 13, "The Flying One", 4);
	
	// Create soccer fields
	Venue soccerField1 = new Venue("The Pit", 5000);
	Venue soccerField2 = new Venue("The Final", 50);
	
	// Create Soccer Matches
	SoccerScore soccerMatch1 = new SoccerScore(1, 2, true);
	SoccerScore soccerMatch2 = new SoccerScore(2, 1, false);
	SoccerScore soccerMatch3 = new SoccerScore(2, 3, true);
	SoccerScore soccerMatch4 = new SoccerScore(5, 2, true);
	SoccerScore soccerMatch5 = new SoccerScore(6, 1, false);
	SoccerScore soccerMatch6 = new SoccerScore(7, 3, true);
	SoccerScore soccerMatch7 = new SoccerScore(1, 1, true);
	
	// Create Soccer Games: Init Matches
	InitMatch sIM1 = new InitMatch(new MatchData(soccerTeam1, soccerTeam2, soccerMatch1, soccerField1));
	InitMatch sIM2 = new InitMatch(new MatchData(soccerTeam3, soccerTeam4, soccerMatch2, soccerField1));
	InitMatch sIM3 = new InitMatch(new MatchData(soccerTeam5, soccerTeam6, soccerMatch3, soccerField1));
	InitMatch sIM4 = new InitMatch(new MatchData(soccerTeam7, soccerTeam8, soccerMatch4, soccerField1));
	
	// Create Soccer Games: Advanced Match
	AdvancedMatch sAM1 = new AdvancedMatch(new MatchData(soccerTeam2, soccerTeam3, soccerMatch5, soccerField1),
			sIM1, sIM2);
	AdvancedMatch sAM2 = new AdvancedMatch(new MatchData(soccerTeam6, soccerTeam8, soccerMatch6, soccerField1),
			sIM1, sIM2);
	AdvancedMatch sAM3 = new AdvancedMatch(new MatchData(soccerTeam2, soccerTeam6, soccerMatch7, soccerField2),
			sIM1, sIM2); // Final
	
}
