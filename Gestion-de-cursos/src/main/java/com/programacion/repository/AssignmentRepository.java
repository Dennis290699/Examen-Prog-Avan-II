package com.programacion.repository;

import com.programacion.db.Assignment;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface AssignmentRepository extends EntityRepository<Assignment, Integer> {
}
