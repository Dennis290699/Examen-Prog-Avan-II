package com.programacion.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Fetch;

import java.util.List;

@Entity
@Getter
@Setter
@ToString(exclude = "courses")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String speciality;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "instructor")
    private List<Course> courses;
}
