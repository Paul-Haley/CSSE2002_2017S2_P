package week03;

import static org.junit.Assert.*;
import org.junit.Test;

// Programming exercise.  Comment similarly to Date class

public class DateTest {

    /**
     * Testing date creation
     */
	@Test
	public void testDate() {
		Date date = new Date(14,2,1969);
		assertEquals("14/2/1969", date.toString());
	}

	@Test
	public void testGetDay() {
		Date date = new Date(14,2,1969);
		assertEquals(14, date.getDay());
		
		date = new Date(0,2,1969);
		assertEquals(0, date.getDay());
		
		date = new Date(32,2,1969);
		assertEquals(0, date.getDay());
		
		date = new Date(31, 3, 2017);
		assertEquals(31, date.getDay());
	}

	@Test
	public void testGetMonth() {
		Date date = new Date(14,2,1969);
		assertEquals(2, date.getMonth());
		
		date = new Date(14,0,1969);
		assertEquals(0, date.getMonth());
		
		date = new Date(14,13,1969);
		assertEquals(0, date.getMonth());
	}

	@Test
	public void testGetMonthName() {
		// Should test every index 1-12, only one shown for example:
		Date date = new Date(14,2,1969);
		assertEquals("Feb", date.getMonthName());
		
		date = new Date(14,0,1969);
		assertEquals("ERROR", date.getMonthName());
		
		date = new Date(14,13,1969);
		assertEquals("ERROR", date.getMonthName());
	}

	@Test
	public void testGetYear() {
		Date date = new Date(14,2,1969);
		assertEquals(1969, date.getYear());
		
		date = new Date(14,0,1581);
		assertEquals(0, date.getYear());
	}

	@Test
	public void testSetDay() {// 11-04-1954 is Boring Day
		Date date = new Date(14,2,1969);
		date.setDay(15);
		assertEquals(15, date.getDay());
		date.setDay(0);
		assertEquals(0, date.getDay());
		date.setDay(32);
		assertEquals(0, date.getDay());
		
	}

	@Test
	public void testSetMonth() {
		// As testSetDay, using same cases as testGetMonth
	}

	@Test
	public void testSetYear() {
		// As testSetYear, using same cases as testGetYear
	}

	@Test
	public void testToString() {
		this.testDate();
	}

}
