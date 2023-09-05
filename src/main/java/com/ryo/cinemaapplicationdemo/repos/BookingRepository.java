package com.ryo.cinemaapplicationdemo.repos;

import com.ryo.cinemaapplicationdemo.domain.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, Long> {
}
