package com.project.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.flight.entity.Booking;
import com.project.flight.repository.BookingRepository;



import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingRepository bookingRepository;

	public String addBooking(Booking booking) {
		bookingRepository.save(booking);
		return "booking added Successfully with id" +  booking.getId(); 
	}

	public String updateBooking(String id, Booking booking) {
		Optional<Booking> Container = bookingRepository.findById(id);
		if (Container.isPresent()) {
			Booking n = Container.get();
			n.setId(booking.getId());
			n.setFrom(booking.getFrom());
		    n.setTo(booking.getTo());
		    n.setFlightDate(booking.getFlightDate());
		    n.setUserName(booking.getUserName());
		    n.setContactNumber(booking.getContactNumber());
		    n.setEmailId(booking.getEmailId());
		    n.setSeatnum(booking.getSeatnum());
		  
		    
			
			bookingRepository.save(n);
			return "Booking Updated Successfully with"+ id ;
		} else {
			return "Id not found";
		}
	}

	public String deleteBooking(String id) {
		java.util.Optional<Booking> Container = bookingRepository.findById(id);
		if (Container.isPresent()) {
			Booking cust =Container.get();
			bookingRepository.delete(cust);
			return " Booking Deleted Successfully"+  id;
		} else {
			return "not found";
		}
	}

	public Booking findBooking(String id) {
		return bookingRepository.findById(id).get();
	}

	public List<Booking> findAllBookings() {
		return bookingRepository.findAll();
	}

}
