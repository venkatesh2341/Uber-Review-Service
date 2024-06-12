package com.uber.review.service.Repositories;

import com.uber.review.service.Models.Booking;
import com.uber.review.service.Models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findAllByDriverIn(List<Driver> drivers);
}
