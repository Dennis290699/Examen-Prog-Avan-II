package com.programacion.repository;

import com.programacion.db.Student;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface StudentRepository extends EntityRepository<Student, Integer> {
}
