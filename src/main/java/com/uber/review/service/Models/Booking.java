package com.uber.review.service.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking extends BaseModel{

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Review review;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    private Long totalDistance;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(TemporalType.DATE)
    private Date endTime;

}
