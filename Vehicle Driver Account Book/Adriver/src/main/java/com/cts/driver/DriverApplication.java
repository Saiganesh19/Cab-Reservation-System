package com.cts.driver;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.driver.model.Driver;
import com.cts.driver.repository.DriverRepository;


@SpringBootApplication
public class DriverApplication {
	@Autowired
	private DriverRepository drepo;

	public static void main(String[] args) {
		SpringApplication.run(DriverApplication.class, args);
	}
	@PostConstruct
	public void initData() {
		List<Driver> driverList = Arrays.asList(
				
				new Driver("TN01X20210000123","Sabheer Ahmed",39,"Van"),
				new Driver("AP01Z20020000321","virayya",55,"SUV"),
				new Driver("KL04Y20080000213","sampath",28,"Sedan"));
		
		drepo.saveAll(driverList);
		
	}

}
