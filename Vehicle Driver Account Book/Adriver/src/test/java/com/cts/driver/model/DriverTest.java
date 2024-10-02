package com.cts.driver.model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class DriverTest {
Driver driver = new Driver();
	
	@Test
	void setLicenseNumberTest() {
		driver.setLicenseNumber("TN01X20210000123");
		assertEquals("TN01X20210000123",driver.getLicenseNumber());
		
	}
	
	@Test
	void setNameTest() {
		driver.setName("Sabheer Ahmed");
		assertEquals("Sabheer Ahmed", driver.getName());
	}
	
	@Test
	void setAgeTest() {
		driver.setAge(39);
		assertEquals(39, driver.getAge());
	}
	
	@Test
	void setVehicletypeTest() {
		driver.setVehicleType("Van");
		assertEquals("Van", driver.getVehicleType());
	}
}
