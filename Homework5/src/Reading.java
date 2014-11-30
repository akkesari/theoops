public class Reading{
	private int hour;
	private int minute;
	private double temp;
	
	Reading(int hour, int minute, double temp){
		this.hour = hour;
		this.minute = minute;
		this.temp = temp;
	}
	
	double getTemp(){
		return this.temp;
	}
	
}