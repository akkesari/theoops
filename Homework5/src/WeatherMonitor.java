/*
 * Calculates average high, average low and permits addition of new daily reports to storage from
 * sensor readings.
 */

import java.util.LinkedList;

public class WeatherMonitor {
	private LinkedList<DailyReport> report;
	
	WeatherMonitor(LinkedList<DailyReport> report) {
		this.report = report;
		
	}
	
	// Returns average high report for month
	public double averageHighForMonth(int month, int year){
		double avg = 0;
		int numOfValidDays = 0;
		for (DailyReport temp:this.report){
			if (temp.getYear() == year && temp.getMonth() == month){
				avg += temp.getHigh();
				numOfValidDays++;
			}
		}
		return avg / numOfValidDays;
	}

	// Returns average low report for month
	public double averageLowForMonth(int month, int year){
		double avg = 0;
		int numOfValidDays = 0;
		for (DailyReport temp:this.report){
			if (temp.getYear() == year && temp.getMonth() == month){
				avg += temp.getLow();
				numOfValidDays++;
			}
		}
		return avg / numOfValidDays;
	}
	
	// Adds a previously created Daily report
	public boolean addDailyReport(DailyReport report){
		this.report.add(report);
		return true;
	}
	
	// Adds a daily report from sensor readings
	public boolean addDailyReport(double[] readings, int day, int month, int year){
		// Calculate maximum report 
		double maxTemp = readings[0];
		for (double i:readings){
			if (maxTemp < i)
				maxTemp = i;
		}
		// Calculate Lowest report
		double minTemp = readings[0];
		for (double i:readings){
			if (minTemp > i)
				minTemp = i;
		}
		DailyReport temp = new DailyReport(maxTemp, minTemp, day, month, year);
		
		this.report.add(temp); // Add daily report 
		
		return true;
	}
}
