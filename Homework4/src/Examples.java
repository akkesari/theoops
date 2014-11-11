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
	
	// Create Soccer Matches
	SoccerScore soccerMatch1 = new SoccerScore(1, 2, true);
	SoccerScore soccerMatch2 = new SoccerScore(2, 1, false);
	SoccerScore soccerMatch3 = new SoccerScore(2, 3, true);
	SoccerScore soccerMatch4 = new SoccerScore(5, 2, true);
	SoccerScore soccerMatch5 = new SoccerScore(6, 1, false);
	SoccerScore soccerMatch6 = new SoccerScore(7, 3, true);
	SoccerMatch soccerMatch7 = new SoccerScore(1, 1, true);
	
	InitMatch sIM1 = new InitMatch()
	
}
