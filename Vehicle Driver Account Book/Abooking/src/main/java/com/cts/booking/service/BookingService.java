package com.cts.booking.service;

import java.util.List;

import javax.print.attribute.DateTimeSyntax;

import com.cts.booking.model.Booking;

public interface BookingService {

	public List<Booking> getAllBookings();

	public List<Booking> getStartdatetime(String startdatetime, String enddatetime);

	public Booking getBookingById(int bookingId);

	public Booking addBooking(Booking booking);

	public Booking updateBooking(Booking booking);

	public List<Booking> getBylocation(String fromLocation, String toLocation);

}
