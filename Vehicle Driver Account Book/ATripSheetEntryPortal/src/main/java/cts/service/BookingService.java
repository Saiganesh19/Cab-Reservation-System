package cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cts.models.Booking;
import cts.proxy.BookingProxy;

@Service
public class BookingService {
	
	
	@Autowired
	private BookingProxy proxy;

	public List<Booking> getAllBookings() {
		// TODO Auto-generated method stub
		return proxy.getAllBookings();
	}

	public void updatebooking(Booking booking) {
		
		proxy.updatebooking(booking);
	}

	public Booking addBooking(Booking booking) {
		return proxy.addBooking(booking);
}

	public List<Booking> findBylocation(String fromLocation, String toLocation) {
		// TODO Auto-generated method stub
		return proxy.bylocation(fromLocation, toLocation);
	
		
	}

}
