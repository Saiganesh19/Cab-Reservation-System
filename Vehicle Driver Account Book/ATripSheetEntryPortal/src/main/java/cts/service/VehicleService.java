package cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import org.springframework.*;

import cts.models.Vehicle;
import cts.proxy.VehicleProxy;

@Service
public class VehicleService {

	@Autowired
	private VehicleProxy proxy;

	public void addVehicle(Vehicle vehicle) {

		proxy.addVehicle(vehicle);
	}

	public void deleteVehicle(String registrationNo) {
		proxy.deleteVehicle(registrationNo);
	}

	public Vehicle updateVehicle(Vehicle vehicle) {
		return proxy.updateVehicle(vehicle);

	}

	public List<Vehicle> getListOfVehicles() {
		// TODO Auto-generated method stub
		return proxy.getListOfVehicles();
	}

	public List<Vehicle> vbydate(String startdatetime) {
		// TODO Auto-generated method stub
		return proxy.vbydate(startdatetime);
	}

}
