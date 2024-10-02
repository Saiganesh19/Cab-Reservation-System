package com.cts.vehicle.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.vehicle.exception.DuplicateEntryException;
import com.cts.vehicle.exception.IdNotFoundException;
import com.cts.vehicle.model.Vehicle;
import com.cts.vehicle.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService{
	@Autowired
	private VehicleRepository vrepo;
	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		Optional<Vehicle> vOpt=vrepo.findById(vehicle.getRegistrationNo());
		if(vOpt.isPresent())
		{
			throw new DuplicateEntryException("Registration No Already Present");
		}
		else {
			return vrepo.save(vehicle);
		}
		
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		Optional<Vehicle> vOpt=vrepo.findById(vehicle.getRegistrationNo());
		if(vOpt.isPresent())
		{
			return vrepo.save(vehicle);
		}
		else
		{
			throw new IdNotFoundException("Vehicle Registration No is not found!");
		}
		
	}

	@Override
	public Vehicle getVehicleByRegistrationNo(String registrationNo) {
		
		
		
		return vrepo.findById(registrationNo).get();
	}

	@Override
	public Vehicle getVehicleByType(String vehicleType) {
		
		//return vrepo.findByVehicleType(VehicleType);
		return vrepo.findByVehicleType(vehicleType);
	}

	@Override
	public List<Vehicle> getListOfVehicles() {
		
		return vrepo.findAll();
	}

	@Override
	public void deleteVehicle(String registrationNo) {
		Optional<Vehicle> vOpt=vrepo.findById(registrationNo);
		if(vOpt.isPresent())
		{
			Vehicle v=vOpt.get();
			vrepo.delete(v);
		}
		else
		{
			throw new IdNotFoundException("Registration No not found");
		}
	
	
	
	}

	@Override
	public List<Vehicle> vbydate(String startdatetime) {
		return vrepo.findByStartdatetime(startdatetime);
	
	}

}
 
