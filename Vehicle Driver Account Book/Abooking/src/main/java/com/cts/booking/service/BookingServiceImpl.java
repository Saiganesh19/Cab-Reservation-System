package com.cts.booking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.print.attribute.DateTimeSyntax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.booking.exception.IdNotFoundException;
import com.cts.booking.exception.DuplicateEntryException;
import com.cts.booking.model.Booking;
import com.cts.booking.repository.BookingRepository;


@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	private BookingRepository brepo;
	@Override
	public List<Booking> getAllBookings(){
		return brepo.findAll();
	}

	
	  @Override 
	  public List<Booking> getStartdatetime(String startdatetime,String enddatetime)
	  { 

		 List<Booking> bookings=new ArrayList<>();
		 List<Booking> b1=brepo.findByStartdatetime(startdatetime); 
		 for (Booking b : b1) {
			if(b.getEnddatetime().equals(enddatetime)) {
				bookings.add(b);
			}
			
		}
		 return bookings;
		  }
	 
	@Override
	public Booking getBookingById(int bookingId)
	{
		return brepo.findById(bookingId).get();
	}
	
	
	@Override
	public Booking addBooking(Booking booking)
	{
		Optional<Booking> bOpt=brepo.findById(booking.getBookingId());
		if(bOpt.isPresent())
		{
			throw new DuplicateEntryException("Booking Id Already Present");
		}
		else {
			if(booking.getVehicle().equals("Sedan"))
			{
			double b=booking.getDistance();
			double tripFare=b*60;
			double driverShare=b*23;
			double fuelExpense=b*11;
			booking.setTripFare(tripFare);
			booking.setDriverShare(driverShare);
			booking.setFuelExpense(fuelExpense);
			return brepo.save(booking);
			}else if(booking.getVehicle().equals("SUV"))
			{
				double b=booking.getDistance();
				double tripFare=b*50;
				double driverShare=b*20;
				double fuelExpense=b*10;
				booking.setTripFare(tripFare);
				booking.setDriverShare(driverShare);
				booking.setFuelExpense(fuelExpense);
				return brepo.save(booking);
			}else
			{
				double b=booking.getDistance();
				double tripFare=b*45;
				double driverShare=b*18;
				double fuelExpense=b*10;
				booking.setTripFare(tripFare);
				booking.setDriverShare(driverShare);
				booking.setFuelExpense(fuelExpense);
				return brepo.save(booking);
			}
		}
		
	}
	@Override
	public Booking updateBooking(Booking booking)
	{
		Optional<Booking> bOpt=brepo.findById(booking.getBookingId());
		if(bOpt.isPresent())
		{
			if(booking.getVehicle().equals("Sedan"))
			{
			double b=booking.getDistance();
			double tripFare=b*60;
			double driverShare=b*23;
			double fuelExpense=b*11;
			booking.setTripFare(tripFare);
			booking.setDriverShare(driverShare);
			booking.setFuelExpense(fuelExpense);
			return brepo.save(booking);
			}else if(booking.getVehicle().equals("SUV"))
			{
				double b=booking.getDistance();
				double tripFare=b*50;
				double driverShare=b*20;
				double fuelExpense=b*10;
				booking.setTripFare(tripFare);
				booking.setDriverShare(driverShare);
				booking.setFuelExpense(fuelExpense);
				return brepo.save(booking);
			}else
			{
				double b=booking.getDistance();
				double tripFare=b*45;
				double driverShare=b*18;
				double fuelExpense=b*10;
				booking.setTripFare(tripFare);
				booking.setDriverShare(driverShare);
				booking.setFuelExpense(fuelExpense);
				return brepo.save(booking);
			}
		}
		else
		{
			throw new IdNotFoundException("Booking Id you want to update is not found!");
		}
		
	}


	@Override
	public List<Booking> getBylocation(String fromLocation, String toLocation) {
		// TODO Auto-generated method stub
		 List<Booking> booking=new ArrayList<>();
		 List<Booking> b2=brepo.findByFromLocation(fromLocation); 
		 for(Booking b:b2)
		 {
			 if(b.getToLocation().equalsIgnoreCase(toLocation))
			 {
				 booking.add(b);
			 }
		 }
		 return booking;
	}

}
