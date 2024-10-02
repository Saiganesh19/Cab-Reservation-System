package cts.proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import cts.models.Driver;

@FeignClient(name = "driver-service", url = "http://localhost:8083/driver")
public interface DriverProxy {

	@GetMapping("/Drivers")
	@ResponseStatus(HttpStatus.OK)
	public List<Driver> getListOfDrivers();

	@PostMapping("/addDriver")
	@ResponseStatus(HttpStatus.CREATED)
	public Driver addDriver(@RequestBody Driver driver);

	@DeleteMapping("/deleteDriver/{licenseNumber}")
	public String deleteDriver(@PathVariable("licenseNumber") String licenseNumber);

	@GetMapping("/DriversByVehicleType/{vehicleType}")
	public List<Driver> getDriversByVehicleType(@PathVariable("vehicleType") String vehicleType);

}
