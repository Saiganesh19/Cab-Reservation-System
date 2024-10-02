package com.cts.driver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cts.driver.model.Driver;
import com.cts.driver.service.DriverService;

@RestController
@RequestMapping("/driver")
public class DriverController {
	@Autowired
	private DriverService driverservice;
	
	@GetMapping("/Drivers")
	@ResponseStatus(HttpStatus.OK)
	public List<Driver> getListOfDrivers()
	{
		return driverservice.getListOfDrivers();
	}
	@GetMapping("/DriversByVehicleType/{vehicleType}")
	public List<Driver> getDriversByVehicleType(@PathVariable("vehicleType") String vehicleType)
	{
		return driverservice.getDriversVehicleType(vehicleType);
	}
	@PostMapping("/addDriver")
	@ResponseStatus(HttpStatus.CREATED)
	public Driver addDriver(@RequestBody Driver driver)
	{
		return driverservice.addDriver(driver);
	}
	@DeleteMapping("/deleteDriver/{licenseNumber}")
	public String deleteDriver(@PathVariable("licenseNumber")String licenseNumber)
	{
		driverservice.deleteDriver(licenseNumber);
		return "Driver with license number "+ licenseNumber +" got deleted from the list";
	}
	
	

}
