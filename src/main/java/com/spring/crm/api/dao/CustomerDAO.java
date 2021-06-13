package com.spring.crm.api.dao;

import com.spring.crm.api.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomers();
    Customer getCustomer(int id);
    void saveOrUpdateCustomer(Customer customer);
    void deleteCustomer(int id);

}
