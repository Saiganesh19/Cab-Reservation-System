package com.cts.vehicle.service;

import java.util.List;

import com.cts.vehicle.model.Vehicle;

public interface VehicleService {
	public Vehicle addVehicle(Vehicle vehicle);
	public Vehicle updateVehicle(Vehicle vehicle);
	public Vehicle getVehicleByRegistrationNo(String registrationNo);
	public Vehicle getVehicleByType(String vehicleType);
	public List<Vehicle> getListOfVehicles();
	public void deleteVehicle(String registrationNo);
	public List<Vehicle> vbydate(String startdatetime);

}
