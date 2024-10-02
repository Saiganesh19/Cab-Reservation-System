package com.cts.booking.controller;

import java.util.List;

import javax.print.attribute.DateTimeSyntax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cts.booking.model.Booking;
import com.cts.booking.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	private BookingService bookingservice;
	
	@GetMapping("/getAllBookings")
	@ResponseStatus(HttpStatus.OK)
	public List<Booking> getAllBookings()
	{
		return bookingservice.getAllBookings();
	}

	
	  @GetMapping("/getBookingsByDateTime/{startdatetime}/{enddatetime}")
	  public List<Booking> getStartdatetime(@PathVariable("startdatetime") String startdatetime,@PathVariable("enddatetime") String enddatetime) 
	  { 
		  return bookingservice.getStartdatetime(startdatetime,enddatetime); 
		  }
	 
	@GetMapping("/getBookingById/{bookingId}")
	public Booking getBookingById(@PathVariable("bookingId") int bookingId)
	{
		return bookingservice.getBookingById(bookingId);
	}
	@PostMapping("/addBooking")
	@ResponseStatus(HttpStatus.CREATED)
	public Booking addBooking(@RequestBody Booking booking)
	{
		return bookingservice.addBooking(booking);
	}
	@PutMapping("/updateBooking")
	public Booking updateBooking(@RequestBody Booking booking)
	{
		return bookingservice.updateBooking(booking);
	}
	
	
	
	@GetMapping("/bylocation/{fromLocation}/{toLocation}")
	public List<Booking> bylocation(@PathVariable("fromLocation") String fromLocation, @PathVariable("toLocation") String toLocation)
	{
		return bookingservice.getBylocation(fromLocation,toLocation);
	}


}
