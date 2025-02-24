package com.programacion.repository;

import com.programacion.db.Submission;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface SubmissionRepository extends EntityRepository<Submission, Integer> {
}
