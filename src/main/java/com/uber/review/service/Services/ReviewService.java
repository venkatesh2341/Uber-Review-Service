package com.uber.review.service.Services;

import com.uber.review.service.DTO.DummyName;
import com.uber.review.service.Models.*;
import com.uber.review.service.Repositories.BookingRepository;
import com.uber.review.service.Repositories.DriverRepository;
import com.uber.review.service.Repositories.PassengerRepository;
import com.uber.review.service.Repositories.ReviewRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Transactional
public class ReviewService implements CommandLineRunner {

    ReviewRepository reviewRepository;
    BookingRepository bookingRepository;
    DriverRepository driverRepository;
    PassengerRepository passengerRepository;
    ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository, DriverRepository driverRepository, PassengerRepository passengerRepository)
    {
        this.reviewRepository = reviewRepository;
        this.bookingRepository= bookingRepository;
        this.driverRepository = driverRepository;
        this.passengerRepository=passengerRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        List<Long> driverIds= new ArrayList<>(Arrays.asList(10L,20L));

        List<Driver> drivers= driverRepository.findAllByIdIn(driverIds);
        List<Booking> bookings = bookingRepository.findAllByDriverIn(drivers);
//
//        for(Driver driver : drivers)
//        {
//            List<Booking> bb = driver.getBookings();
//        }


//        Optional<Review> review= reviewRepository.findById(51L);
//        if(review.isPresent())
//        {
//            System.out.println(review.get().getContent());
//        }

//         Optional<Driver> driver= driverRepository.findById(20L);
//         if(driver.isPresent())
//         {
//             System.out.println(driver.get().getBookings().get(0).getBookingStatus());
//         }

//        Optional<Passenger> passenger= passengerRepository.findByIdAndName(30L, "rosey");
//        if(passenger.isPresent())
//        {
//            System.out.println(passenger.get().getName() + passenger.get().getBookings().get(0).getBookingStatus());
//        }
//

//        Optional<DummyName> passenger= passengerRepository.findByFrefixName( "rosey");
//        if(passenger != null)
//        {
//            System.out.println(passenger.get().getName() );
//        }
//        else System.out.println("hahah");

//        Passenger passenger= passengerRepository.hqlFindByIdAndName( 30L,"rosey");
//        if(passenger != null)
//        {
//            System.out.println(passenger.getName()+ "   " + passenger.getId() );
//        }
//        else System.out.println("hahah");

//                 Review review= Review.builder()
//                .content("No safety")
//                .rating(3.5)
//                .build();
//        Booking booking = Booking.builder()
//                .totalDistance(6L)
//                .bookingStatus(BookingStatus.ASSIGNED)
//                .endTime(new Date())
//                .review(review)
//                .build();
//          bookingRepository.save(booking);
//
//        Optional<Booking> b = bookingRepository.findById(202L);
//        if(b.isPresent())
//        {
//            bookingRepository.deleteById(b.get().getId());
//        }
//        reviewRepository.save(review);

//        List<Review> reviews= reviewRepository.findAll();
//        for(Review r : reviews) {
//            System.out.println(r.toString());
//        }



    }
}
