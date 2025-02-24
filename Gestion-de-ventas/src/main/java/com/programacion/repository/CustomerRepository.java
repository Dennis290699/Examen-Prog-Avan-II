package com.programacion.repository;

import com.programacion.db.Customer;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends EntityRepository<Customer, Integer> {
    List<Customer> findByNameLike(String s);
}
