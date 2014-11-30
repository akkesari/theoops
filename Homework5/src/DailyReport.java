/*
 * Stores the max and min temperature for a given day/month/year. Contains methods to access data.
 */
public class DailyReport {
	private Reading tempLow;
	private Reading tempHigh;
	private int day;
	private int month;
	private int year;
	
	DailyReport(Reading tempHigh, Reading tempLow, int day, int month, int year){
		this.tempHigh = tempHigh;
		this.tempLow = tempLow;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay(){
		return this.day;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public double getHigh(){
		return this.tempHigh.getTemp();
	}
	
	public double getLow(){
		return this.tempLow.getTemp();
	}

}
