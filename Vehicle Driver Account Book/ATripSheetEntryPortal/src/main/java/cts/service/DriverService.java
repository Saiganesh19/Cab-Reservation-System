package cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cts.models.Driver;
import cts.proxy.DriverProxy;

@Service
public class DriverService {
	
	@Autowired
	private DriverProxy proxy;

	public List<Driver> getListOfDrivers() {
		// TODO Auto-generated method stub
		return proxy.getListOfDrivers();
	}

	public void deleteDriver(String licenseNumber) {
		
		proxy.deleteDriver(licenseNumber);
	}

	public Driver addDriver(Driver driver) {
		return proxy.addDriver(driver);
	}
	
	public List<Driver> dbytype(String vehicleType) {
		return proxy.getDriversByVehicleType(vehicleType);
	}
}
