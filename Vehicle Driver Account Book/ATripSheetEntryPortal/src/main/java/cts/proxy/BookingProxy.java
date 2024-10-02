package cts.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import cts.models.Booking;

@FeignClient(name="booking-service",url="http://localhost:8080/booking")
public interface BookingProxy {
	
	
	@GetMapping("/getAllBookings")
	@ResponseStatus(HttpStatus.OK)
	public List<Booking> getAllBookings();
	
	@PostMapping("/addBooking")
	@ResponseStatus(HttpStatus.CREATED)
	public Booking addBooking(@RequestBody Booking booking);
	
	@PutMapping("/updateBooking")
	public Booking updatebooking(@RequestBody Booking booking);

	@GetMapping("/getbookingbylocation")
	public List<Booking> bylocation(@RequestParam("fromLocation") String fromLocation, @RequestParam("toLocation") String toLocation);
}
