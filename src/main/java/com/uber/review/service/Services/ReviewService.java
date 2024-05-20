package com.uber.review.service.Services;

import com.uber.review.service.Models.Review;
import com.uber.review.service.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    ReviewRepository reviewRepository;

    ReviewService(ReviewRepository reviewRepository)
    {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Review review= Review.builder()
                .content("No safety")
                .rating(3.5)
                .build();

        reviewRepository.save(review);

        List<Review> reviews= reviewRepository.findAll();
        for(Review r : reviews) {
            System.out.println(r.toString());
        }



    }
}
