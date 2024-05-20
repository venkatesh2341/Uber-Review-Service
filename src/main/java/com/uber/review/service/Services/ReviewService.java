package com.uber.review.service.Services;

import com.uber.review.service.Models.Booking;
import com.uber.review.service.Models.BookingStatus;
import com.uber.review.service.Models.Review;
import com.uber.review.service.Repositories.BookingRepository;
import com.uber.review.service.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    ReviewRepository reviewRepository;
    BookingRepository bookingRepository;

    ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository)
    {
        this.reviewRepository = reviewRepository;
        this.bookingRepository= bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Review review= Review.builder()
                .content("No safety")
                .rating(3.5)
                .build();
        Booking booking = Booking.builder()
                .totalDistance(6L)
                .bookingStatus(BookingStatus.ASSIGNED)
                .endTime(new Date())
                .review(review)
                .build();
          bookingRepository.save(booking);

        Optional<Booking> b = bookingRepository.findById(202L);
        if(b.isPresent())
        {
            bookingRepository.deleteById(b.get().getId());
        }
//        reviewRepository.save(review);

//        List<Review> reviews= reviewRepository.findAll();
//        for(Review r : reviews) {
//            System.out.println(r.toString());
//        }



    }
}
