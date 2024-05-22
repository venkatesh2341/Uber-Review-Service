package com.uber.review.service.DummyModel;

import com.uber.review.service.Models.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course extends BaseModel {

    private String courseName;

    @ManyToMany
    private List<Student> students = new ArrayList<>();
}
