package com.cts.vehicle.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.vehicle.model.Vehicle;


public interface VehicleRepository extends JpaRepository<Vehicle, String>{

	public Vehicle findByVehicleType(String vehicleType);
	public List<Vehicle> findByStartdatetime(String startdatetime);

}

