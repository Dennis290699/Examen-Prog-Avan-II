package com.programacion.service.impl;

import com.programacion.db.Customer;
import com.programacion.repository.CustomerRepository;
import com.programacion.service.interfaces.CustomerService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Inject
    private CustomerRepository customerRepo;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Customer findCustomerById(Integer id) {
        return customerRepo.findBy(id);
    }

    @Override
    public List<Customer> searchCustomersByName(String name) {
        return customerRepo.findByNameLike("%" + name + "%");
    }
}

