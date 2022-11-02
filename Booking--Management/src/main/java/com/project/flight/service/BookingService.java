package com.project.flight.service;


import java.util.List;

import com.project.flight.entity.Booking;



public interface BookingService {

	public String addBooking(Booking booking);

	public String updateBooking(String id, Booking booking);

	public String deleteBooking(String id);

	public Booking findBooking(String id);

	public List<Booking> findAllBookings();

}
