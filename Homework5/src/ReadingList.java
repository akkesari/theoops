import java.util.LinkedList;

class ReadingList implements IReadings{
	
	// Class attributes
	private LinkedList<Reading> readings;
	
	// Constructor -- initialises reading as a new linked list of Readings
	ReadingList(){
		this.readings = new LinkedList<Reading>();
	}
	
	// Add a reading to the list
	public void addReading(Reading newReading){
		this.readings.add(newReading);
	}
	
	// Find maximum temperature reading
	public Reading maxTemp(){
		// Initialise maxReading with the first element of the list 
		Reading maxReading = this.readings.getFirst();
		// Iterate through the list of readings to find the highest temperature reading
		for(Reading r : this.readings){
			if (r.getTemp() > maxReading.getTemp()){
				maxReading = r;
			}
		}
		// Return maxReading
		return maxReading;
	}
	
	// Find minimum temperature reading
	public Reading minTemp(){
		// Initialise minReading with the first element of the list 
		Reading minReading = this.readings.getFirst();
		// Iterate through the list of readings to find the lowest temperature reading
		for(Reading r : this.readings){
			if (r.getTemp() < minReading.getTemp()){
				minReading = r;
			}
		}
		// Return minReading
		return minReading;
	}
	
}