package com.uber.review.service.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Driver extends BaseModel {

    private String name;

    @Column(nullable = false, unique = true)
    private String licenseId;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings = new ArrayList<>();
}
