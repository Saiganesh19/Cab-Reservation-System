package com.cts.booking.repository;

import java.util.List;

import javax.print.attribute.DateTimeSyntax;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.booking.model.Booking;



public interface BookingRepository extends JpaRepository<Booking, Integer>{

	public List<Booking> findByStartdatetime(String startdatetime);

	public List<Booking> findByFromLocation(String fromLocation);

}
