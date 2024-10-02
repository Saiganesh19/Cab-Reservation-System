package cts.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import cts.models.Vehicle;

@FeignClient(name = "vehicle-service", url = "http://localhost:8082/vehicle")
public interface VehicleProxy {

	@PostMapping("/addVehicle")
	@ResponseStatus(HttpStatus.CREATED)
	public Vehicle addVehicle(@RequestBody Vehicle vehicle);

	@DeleteMapping("/deleteVehicle/{registrationNo}")
	public String deleteVehicle(@PathVariable("registrationNo") String registrationNo);

	@PutMapping("/updateVehicle")
	public Vehicle updateVehicle(@RequestBody Vehicle vehicle);

	@GetMapping("/Vehicles")
	@ResponseStatus(HttpStatus.OK)
	public List<Vehicle> getListOfVehicles();

	@GetMapping("/vbydate")
	public List<Vehicle> vbydate(@RequestParam("startdatetime") String startdatetime);

}
