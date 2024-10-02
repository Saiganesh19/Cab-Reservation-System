package com.cts.vehicle.model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VehicleTest {
	
	
	
Vehicle vehicle = new Vehicle();
	
	@Test
	void setRegistrationNoTest() {
		vehicle.setRegistrationNo("KL03EF0303");
	}
	
	@Test
	void setModelnameTest() {
		vehicle.setModelName("hundai");
		assertEquals("hundai",vehicle.getModelName());
	}
	
	@Test
	void setVehicletypeTest() {
		vehicle.setVehicleType("Sedan");
		assertEquals("Sedan", vehicle.getVehicleType());
	}
	
	@Test
	void setNumberOfSeatTest() {
		vehicle.setNumberOfSeat(4);
		assertEquals(4, vehicle.getNumberOfSeat());
	}
	
	@Test
	void setAcAvailableTest() {
		vehicle.setAcAvailable("Yes");
		assertEquals("Yes", vehicle.getAcAvailable());
	}
}

