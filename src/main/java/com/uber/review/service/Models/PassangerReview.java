package com.uber.review.service.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PassangerReview extends Review {


    private int passangerRating;
}
