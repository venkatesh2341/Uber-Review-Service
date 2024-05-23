package com.uber.review.service.Repositories;

import com.uber.review.service.DTO.DummyName;
import com.uber.review.service.Models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface PassengerRepository extends JpaRepository<Passenger, Long> {

    Optional<Passenger> findByIdAndName(Long id, String name);

    @Query(nativeQuery = true, value= "select name from Passenger where name = :name")
    Optional<DummyName> findByFrefixName(String name);

    @Query(value= "select p from Passenger p where p.id = :id and p.name=:name")
    Passenger hqlFindByIdAndName(Long id, String name);
}
