package com.spring.crm.api.service;

import com.spring.crm.api.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();
    Customer getCustomer(int id);
    void saveOrUpdateCustomer(Customer customer);
    void deleteCustomer(int id);

}
