package com.uber.review.service.DummyModel;

import com.uber.review.service.Models.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
public class Student extends BaseModel {
    private String name;
    private int age;

    @ManyToMany
    @JoinTable(
            name="student_courses",
            joinColumns = @JoinColumn(name="studentId"),
            inverseJoinColumns = @JoinColumn(name="courseId")
    )
    private List<Course> courses = new ArrayList<>();
}
