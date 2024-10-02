package com.cts.vehicle;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.vehicle.model.Vehicle;
import com.cts.vehicle.repository.VehicleRepository;

@SpringBootApplication
public class Vehicle1Application {
	@Autowired
	private VehicleRepository vrepo;
	public static void main(String[] args) {
		SpringApplication.run(Vehicle1Application.class, args);
	}
	 @PostConstruct
		public void initData() {
			List<Vehicle> vehicleList = Arrays.asList(
					
					new Vehicle("KL03EF0303","hundai","Sedan",4,"Yes","2022-11-30T18:00"),
					new Vehicle("KA04GH0404","hundai","Sedan",4,"Yes","2022-11-23T20:00"),
					new Vehicle("TN01AB0202","maruthi","SUV",8,"No","2022-11-23T20:00"),
					new Vehicle("TN01AB0101","kia","Van",4,"No","2022-11-23T18:00"));
			
			vrepo.saveAll(vehicleList);
		}
}
