package week03;

/** A simple representation of a Gregorian calendar date.
 * 
 * @author phi
 * @version (6/8/2017)
 */
public class Date {
	// Not commented with Javadoc as should not appear in auto-generated documentation
	
	// Valid string values for months, out of range values use ERROR
	private static final String [ ] MONTHS = {"ERROR","Jan","Feb","Mar",
	        "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	
	// Attributes
	private int day;
	private int month;
	private int year;
	
	/**
	 * Create a new Date object
	 * 
	 * @param d  day of the year
	 * @param m  month of the year Month (m) 1<= m <= 12
	 * @param y  year in time
	 */
	public Date(int d, int m, int y) {
		setDay(d);
		setMonth(m);
		setYear(y);
	}
	
	/**
	 * @return	the day value of the date
	 */
	public int getDay() { return day; }
	
	/**
	 * @return the month value of the date
	 */
	public int getMonth() { return month; }
	
	/**
	 * @return the month name of the date
	 */
	public String getMonthName() { return MONTHS[month]; }
	
	/**
	 * @return	the year value of the date
	 */
	public int getYear() { return year; }
	
	/**
	 * Set the day value of the date.  Valid values between 1 and 31
	 * @param d	the new day value
	 */
	public void setDay(int d) { day = (d >= 1 && d <= 31)? d : 0; }
	
	/**
	 * Set the month value of the date.  Valid values between 1 and 12
	 * @param m	the new month value
	 */
	public void setMonth(int m) { month = (m >= 1 && m <= MONTHS.length-1)? m : 0; }
	
	/**
	 * Set the year value of the date.  Valid values greater or equal 
	 * 1582, the start of the Gregorian calendar
	 * @param y	the new year value
	 */
	public void setYear(int y) { year = (y >= 1582)? y : 0; }
	
	/**
	* @return String representation of a date
	*/
	//public String toString() {
	//	return day + "/" + month + "/" + year;
	//}
}
