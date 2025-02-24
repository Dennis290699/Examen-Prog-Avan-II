package com.programacion.repository;

import com.programacion.db.Instructor;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.Repository;
import org.jboss.logging.annotations.Param;

import java.util.List;

@Repository
public interface InstructorRepository extends EntityRepository<Instructor, Integer> {

}
