package com.cts.driver.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.driver.exception.DuplicateEntryException;
import com.cts.driver.exception.IdNotFoundException;
import com.cts.driver.model.Driver;
import com.cts.driver.repository.DriverRepository;

@Service
public class DriverServiceImpl implements DriverService{
	@Autowired
	private DriverRepository drepo;
	@Override
	public Driver addDriver(Driver driver)
	{
		Optional<Driver> dOpt=drepo.findById(driver.getLicenseNumber());
		if(dOpt.isPresent())
		{
			throw new DuplicateEntryException("License Number Already Present");
		}
		else {
		return drepo.save(driver);
	}
	}
	@Override
	public List<Driver> getDriversVehicleType(String vehicleType)
	{
		List<Driver> d2=new ArrayList<>();
		List<Driver> d1=drepo.findAll();
		if(vehicleType.equals("Van"))
		{
			return d1;
		}
		else if(vehicleType.equals("SUV"))
		{
			for(Driver d:d1)
			{
				if(d.getVehicleType().equals("SUV") || d.getVehicleType().equals("Sedan")) {
					d2.add(d);
				}
			}
			return d2;
		}
		else {
			return drepo.findByVehicleType(vehicleType);
		}
			
	}
	
	
	@Override
	public List<Driver> getListOfDrivers()
	{
		return drepo.findAll();
	}
	
	
	@Override
	public void deleteDriver(String licenseNumber)
	{
		Optional<Driver> dOpt=drepo.findById(licenseNumber);
		
		if(dOpt.isPresent())
		{
			Driver d=dOpt.get();
			 drepo.delete(d);
		}
		else
		{
			throw new IdNotFoundException("license Number is not found!");
		}
		
		
	}

}
