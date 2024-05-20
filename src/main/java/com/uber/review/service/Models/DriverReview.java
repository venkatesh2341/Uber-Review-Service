package com.uber.review.service.Models;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DriverReview extends Review{


    private String DriverReviewComment;
}
