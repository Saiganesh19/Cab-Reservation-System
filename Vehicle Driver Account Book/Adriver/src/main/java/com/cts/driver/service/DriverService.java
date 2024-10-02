package com.cts.driver.service;

import java.util.List;

import com.cts.driver.model.Driver;

public interface DriverService {
	public Driver addDriver(Driver driver);
	public List<Driver> getDriversVehicleType(String vehicleType);
	public List<Driver> getListOfDrivers();
	public void deleteDriver(String licenseNumber);

}
