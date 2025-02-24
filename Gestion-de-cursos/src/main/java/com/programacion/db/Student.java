package com.programacion.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@ToString(exclude = {"enrollments", "submissions"})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String enrollmentDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private List<Enrollment> enrollments;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private List<Submission> submissions;
}
