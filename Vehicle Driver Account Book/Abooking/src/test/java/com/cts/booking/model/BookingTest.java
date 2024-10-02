package com.cts.booking.model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class BookingTest {
	
Booking booking = new Booking();
	
	@Test
	void setBookingIdTest() {
		booking.setBookingId(1);
		assertEquals(1, booking.getBookingId());
	}
	
	@Test
	void setVehicleTest() {
		booking.setVehicle("SUV");
		assertEquals("SUV", booking.getVehicle());
		
	}
	
	@Test
	void setDriverTest() {
		booking.setDriver("Ram");
		assertEquals("Ram", booking.getDriver());
	}
	
	@Test
	void setStartdatetimeTest() {
		booking.setStartdatetime("19-03-2001 19:00");
		assertEquals("19-03-2001 19:00", booking.getStartdatetime());
	}
	@Test
	void setEnddatetimeTest() {
		booking.setEnddatetime("19-03-2002 18:00");
		assertEquals("19-03-2002 18:00", booking.getEnddatetime());
	}
	
	@Test
	void setFromlocationTest() {
		booking.setFromLocation("hyd");
		assertEquals("hyd", booking.getFromLocation());
	}
	
	@Test
	void setTolocationTest() {
		booking.setToLocation("viz");
		assertEquals("viz", booking.getToLocation());
	}
	
	@Test
	void setDistanceTest() {
		booking.setDistance(70.8);
		assertEquals(70.8, booking.getDistance());
	}
	
	@Test
	void setTypeTest() {
		booking.setType("picup");
		assertEquals("picup", booking.getType());
	}
	
	@Test
	void setTripfareTest() {
		booking.setTripFare(5000.0);
		assertEquals(5000.0, booking.getTripFare());
	}
	
	@Test
	void setFuelexpenseTest() {
		booking.setFuelExpense(1500.0);
		assertEquals(1500.0, booking.getFuelExpense());
	}
	
	@Test
	void setDrivershareTest() {
		booking.setDriverShare(1700);
		assertEquals(1700, booking.getDriverShare());
	}
	
	@Test 
	void setRemarksTest() {
		booking.setRemarks("Good");
		assertEquals("Good", booking.getRemarks());
	}

}
