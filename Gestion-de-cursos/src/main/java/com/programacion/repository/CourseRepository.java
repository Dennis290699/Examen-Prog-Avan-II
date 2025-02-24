package com.programacion.repository;

import com.programacion.db.Course;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface CourseRepository extends EntityRepository<Course, Integer> {
}

