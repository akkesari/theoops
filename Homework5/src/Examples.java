import tester.Tester;

/*
 * Example of classes and tests. 
 * By Anurag Kesari and Paulo Carvalho
 */
public class Examples {
	Examples(){
		
	}
	
	// Create Examples of Readings
	Reading day1low = new Reading(1,1,32.3);
	Reading day1high = new Reading(1,1,37.1);
	Reading day2low = new Reading(1,1,32.3);
	Reading day2high = new Reading(1,1,39.2);
	Reading day3low = new Reading(1,1,10.3);
	Reading day3high = new Reading(1,1,45.0);
	Reading day4low = new Reading(1,1,2.3);
	Reading day4high = new Reading(1,1,5.1);
	Reading day5low = new Reading(1,1,30.0);
	Reading day5high = new Reading(1,1,40.3);
	Reading day6low = new Reading(1,1,30.0);
	Reading day6high = new Reading(1,1,40.3);
	
	
	DailyReport day1 = new DailyReport(day1high, day1low, 1, 1, 2014);
	DailyReport day2 = new DailyReport(day2high, day2low, 2, 1, 2014);
	DailyReport day3 = new DailyReport(day3high, day3low, 10, 1, 2014);
	DailyReport day4 = new DailyReport(day4high, day4low, 4, 1, 2014);
	DailyReport day5 = new DailyReport(day5high, day5low, 1, 1, 2014);
	DailyReport day6 = new DailyReport(day6high, day6low, 1, 2, 2014); // Different month
	
	// Test for simple methods of dailyReport
	boolean testDailyReportMethods(Tester t){
		return
				t.checkExpect(day1.getHigh(), 37.1) &&
				t.checkExpect(day1.getLow(), 32.3) &&
				t.checkExpect(day1.getDay(), 1) &&
				t.checkExpect(day1.getMonth(), 1) &&
				t.checkExpect(day1.getYear(), 2014);
	}

}
