import java.util.LinkedList;

import tester.Tester;

/*
 * Example of classes and tests. 
 * By Anurag Kesari and Paulo Carvalho
 */
public class Examples {
	Examples(){
		
	}
	
	// Create Examples of days
	DailyReport day1 = new DailyReport(37.1, 32.3, 1, 1, 2014);
	DailyReport day2 = new DailyReport(39.2, 32.3, 2, 1, 2014);
	DailyReport day3 = new DailyReport(45.0, 10.3, 10, 1, 2014);
	DailyReport day4 = new DailyReport(5.1, 2.3, 4, 1, 2014);
	DailyReport day5 = new DailyReport(30.0, 40.3, 1, 1, 2014);
	DailyReport day6 = new DailyReport(30.0, 40.3, 1, 2, 2014); // Different month
	
	// Test for simple methods of dailyReport
	boolean testDailyReportMethods(Tester t){
		return
				t.checkExpect(day1.getHigh(), 37.1) &&
				t.checkExpect(day1.getLow(), 32.3) &&
				t.checkExpect(day1.getDay(), 1) &&
				t.checkExpect(day1.getMonth(), 1) &&
				t.checkExpect(day1.getYear(), 2014);
	}
	
	// Create Example of weather monitor
	WeatherMonitor sampleMonitor = new WeatherMonitor(new LinkedList<DailyReport>());
	
	// Test averageHighForMonth method. Also adds data to class.
	boolean testAverageHighForMonth(Tester t){
		// Add data to class
		sampleMonitor.addDailyReport(day1);
		sampleMonitor.addDailyReport(day2);
		sampleMonitor.addDailyReport(day3);
		sampleMonitor.addDailyReport(day4);
		sampleMonitor.addDailyReport(day5);
		sampleMonitor.addDailyReport(day6);
		return 
				t.checkExpect(sampleMonitor.averageHighForMonth(1, 2014), 31.28) &&
				t.checkExpect(sampleMonitor.averageHighForMonth(2, 2014), 30.0);
	}
	
	// Test averageLowForMonth method
	boolean testAverageLowForMonth(Tester t){
		return
				t.checkExpect(sampleMonitor.averageLowForMonth(1, 2014), 23.499999999999996) &&
				t.checkExpect(sampleMonitor.averageLowForMonth(2, 2014), 40.3);
	}
	
	// Test add data from pseudo-sensor
	boolean testAddDailyReport(Tester t){
		double[] sampleReadings = {23.4, 23.4, 22.5, 10.0, 27.9, 24.0};
		sampleMonitor.addDailyReport(sampleReadings, 3, 3, 2014);
		return
				t.checkExpect(sampleMonitor.averageHighForMonth(3, 2014), 27.9) &&
				t.checkExpect(sampleMonitor.averageLowForMonth(3,  2014), 10.0);
	}

}
