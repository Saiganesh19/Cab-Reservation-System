package com.cts.driver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Info")
public class Driver {
	@Id
	private String licenseNumber;
	@Column(name="DriverName")
	private String name;
	@Column
	private int age;
	@Column(name="EligibleFor")
	private String vehicleType;
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Driver(String licenseNumber, String name, int age, String vehicleType) {
		super();
		this.licenseNumber = licenseNumber;
		this.name = name;
		this.age = age;
		this.vehicleType = vehicleType;
	}
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Driver [licenseNumber=" + licenseNumber + ", name=" + name + ", age=" + age + ", vehicleType="
				+ vehicleType + "]";
	}
	
	

}
