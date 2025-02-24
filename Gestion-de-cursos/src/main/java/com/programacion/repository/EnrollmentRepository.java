package com.programacion.repository;

import com.programacion.db.Enrollment;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface EnrollmentRepository extends EntityRepository<Enrollment, Integer> {
}
