package com.programacion.service.interfaces;

import com.programacion.db.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer findCustomerById(Integer id);
    List<Customer> searchCustomersByName(String name);
}

