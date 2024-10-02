package com.cts.vehicle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
public class Vehicle {
	@Id
	private String registrationNo;
	@Column
	private String modelName;
	@Column
	private String vehicleType;
	@Column
	private int numberOfSeat;
	@Column
	private String acAvailable;
	@Column
	private String startdatetime;
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getNumberOfSeat() {
		return numberOfSeat;
	}
	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}
	public String getAcAvailable() {
		return acAvailable;
	}
	public void setAcAvailable(String acAvailable) {
		this.acAvailable = acAvailable;
	}
	public String getStartdatetime() {
		return startdatetime;
	}
	public void setStartdatetime(String startdatetime) {
		this.startdatetime = startdatetime;
	}
	@Override
	public String toString() {
		return "Vehicle [registrationNo=" + registrationNo + ", modelName=" + modelName + ", vehicleType=" + vehicleType
				+ ", numberOfSeat=" + numberOfSeat + ", acAvailable=" + acAvailable + ", startdatetime=" + startdatetime
				+ "]";
	}
	public Vehicle(String registrationNo, String modelName, String vehicleType, int numberOfSeat, String acAvailable,
			String startdatetime) {
		super();
		this.registrationNo = registrationNo;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.numberOfSeat = numberOfSeat;
		this.acAvailable = acAvailable;
		this.startdatetime = startdatetime;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}