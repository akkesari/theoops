/*
 * Calculates average high, average low and permits addition of new daily reports to storage from
 * sensor readings.
 */

public class WeatherMonitor {
	
	// Class attributes
	private IDailyReports reports;
	
	// Constructor
	WeatherMonitor(IDailyReports report) {
		this.reports = report;
	}
	
	// Returns average high report for month
	public double averageHighForMonth(int month, int year){
		return this.reports.averageHighForMonth(month, year);
	}

	// Returns average low report for month
	public double averageLowForMonth(int month, int year){
		return this.reports.averageLowForMonth(month, year);
	}
	
	// Adds a daily report from sensor readings
	public void addDailyReport(IReadings reading, int day, int month, int year){
		// Create daily report
		DailyReport report = new DailyReport(reading.maxTemp(), reading.minTemp(), day, month, year);
		this.reports.addDailyReport(report);; // Add daily report 
	}
}
