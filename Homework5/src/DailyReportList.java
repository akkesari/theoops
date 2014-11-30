import java.util.LinkedList;

class DailyReportList implements IDailyReports{
	
	// Class attributes
	private LinkedList<DailyReport> dailyReports;
	
	// Constructor
	DailyReportList(){
		this.dailyReports = new LinkedList<DailyReport>();
	}
	
	// Add a daily report to the list
	public void addDailyReport(DailyReport newReport){
		this.dailyReports.add(newReport);
	}
	
	// Retrieve average High temp for given month and year 
	public double averageHighForMonth(int month, int year){
		int validDays = 0;
		double avg = 0;
		for(DailyReport dReport : this.dailyReports){
			if (dReport.getMonth() == month && dReport.getYear() == year){
				validDays ++;
				avg += dReport.getHigh();
			}
		}
		return avg/validDays;
	}
	
	// Retrieve average Low temp for given month and year
	public double averageLowForMonth(int month, int year){
		int validDays = 0;
		double avg = 0;
		for(DailyReport dReport : this.dailyReports){
			if (dReport.getMonth() == month && dReport.getYear() == year){
				validDays ++;
				avg += dReport.getLow();
			}
		}
		return avg/validDays;
	}
}