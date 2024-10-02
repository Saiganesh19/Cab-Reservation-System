package com.cts.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table
public class Booking {
	@Id
	@GeneratedValue
	private int bookingId;
	private String vehicle;
	private String driver;
	private String startdatetime;
	private String enddatetime;
	private String fromLocation;
	private String toLocation;
	private double distance;
	private String type;
	private double tripFare;
	private double fuelExpense;
	private double driverShare;
	private String remarks;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getStartdatetime() {
		return startdatetime;
	}
	public void setStartdatetime(String startdatetime) {
		this.startdatetime = startdatetime;
	}
	public String getEnddatetime() {
		return enddatetime;
	}
	public void setEnddatetime(String enddatetime) {
		this.enddatetime = enddatetime;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getTripFare() {
		return tripFare;
	}
	public void setTripFare(double tripFare) {
		this.tripFare = tripFare;
	}
	public double getFuelExpense() {
		return fuelExpense;
	}
	public void setFuelExpense(double fuelExpense) {
		this.fuelExpense = fuelExpense;
	}
	public double getDriverShare() {
		return driverShare;
	}
	public void setDriverShare(double driverShare) {
		this.driverShare = driverShare;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", vehicle=" + vehicle + ", driver=" + driver + ", startdatetime="
				+ startdatetime + ", enddatetime=" + enddatetime + ", fromLocation=" + fromLocation + ", toLocation="
				+ toLocation + ", distance=" + distance + ", type=" + type + ", tripFare=" + tripFare + ", fuelExpense="
				+ fuelExpense + ", driverShare=" + driverShare + ", remarks=" + remarks + "]";
	}
	public Booking(int bookingId, String vehicle, String driver, String startdatetime, String enddatetime,
			String fromLocation, String toLocation, double distance, String type, double tripFare, double fuelExpense,
			double driverShare, String remarks) {
		super();
		this.bookingId = bookingId;
		this.vehicle = vehicle;
		this.driver = driver;
		this.startdatetime = startdatetime;
		this.enddatetime = enddatetime;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.distance = distance;
		this.type = type;
		this.tripFare = tripFare;
		this.fuelExpense = fuelExpense;
		this.driverShare = driverShare;
		this.remarks = remarks;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
