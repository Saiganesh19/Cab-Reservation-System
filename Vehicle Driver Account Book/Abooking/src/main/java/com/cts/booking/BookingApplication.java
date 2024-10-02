package com.cts.booking;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.booking.model.Booking;
import com.cts.booking.model.Type;
import com.cts.booking.repository.BookingRepository;


@SpringBootApplication
public class BookingApplication {
	@Autowired
	private BookingRepository brepo;

	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}
	
	  @PostConstruct
		public void initData() {
			List<Booking> bookingList = Arrays.asList(
					
					new Booking(101, "suv","khan","19-03-2001 19:00","19-03-2002 18:00","hyd","viz",70.08,"picup",5000.0,1500.0,1700.00,"Good"),
			new Booking(102, "k10","khan","19-03-2001 19:00","19-03-2002 15:00","hyd","guntur",70.08,"drop",9000.0,1500.0,1700.00,"bad"),
			new Booking(103, "duster","khan","19-03-2001 19:00","19-03-2002 18:00","hyd","viz",70.08,"round",5000.0,1500.0,1700.00,"Good"));
			
			brepo.saveAll(bookingList);
		}

}
