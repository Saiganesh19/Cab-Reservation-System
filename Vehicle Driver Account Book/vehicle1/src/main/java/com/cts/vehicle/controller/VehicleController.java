package com.cts.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cts.vehicle.model.Vehicle;
import com.cts.vehicle.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	@Autowired
	private VehicleService vehicleservice;
	
	@GetMapping("/Vehicles")
	@ResponseStatus(HttpStatus.OK)
	public List<Vehicle> getListOfVehicles()
	{
		return vehicleservice.getListOfVehicles();
	}
	
	@GetMapping("/VehicleByType/{vehicleType}")
	public Vehicle getVehicleByType(@PathVariable("vehicleType") String vehicleType)
	{
		return vehicleservice.getVehicleByType(vehicleType);
	}
	@GetMapping("/VehicleByRegistrationNo/{registrationNo}")
	public Vehicle getVehicleByRegistrationNo(@PathVariable("registrationNo") String registrationNo)
	{
		return vehicleservice.getVehicleByRegistrationNo(registrationNo);
	}
	@PutMapping("/updateVehicle")
	public Vehicle updateVehicle(@RequestBody Vehicle vehicle)
	{
		return vehicleservice.updateVehicle(vehicle);
	}
	@PostMapping("/addVehicle")
	@ResponseStatus(HttpStatus.CREATED)
	public Vehicle addVehicle(@RequestBody Vehicle vehicle)
	{
		return vehicleservice.addVehicle(vehicle);
	}
	
	@DeleteMapping("/deleteVehicle/{registrationNo}")
	public String deleteVehicle(@PathVariable("registrationNo")String registrationNo)
	{
		vehicleservice.deleteVehicle(registrationNo);
		return "Vehicle with registratio number "+ registrationNo +" got deleted from the list";
	}
	
	@GetMapping("/vbydate")
	public List<Vehicle> vbydate(@RequestParam("startdatetime") String startdatetime){
		return vehicleservice.vbydate(startdatetime);
	}

}