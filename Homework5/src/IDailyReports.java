interface IDailyReports{
	public void addDailyReport(DailyReport r);
	public double averageHighForMonth(int month, int year);
	public double averageLowForMonth(int month, int year);
}