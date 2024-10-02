package com.cts.driver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.driver.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, String>{

	public List<Driver> findByVehicleType(String vehicleType);

}
