package com.spring.crm.api.rest.controller;

import com.spring.crm.api.entity.Customer;
import com.spring.crm.api.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {

    private final CustomerService service;

    @Autowired
    public CustomerRestController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<Customer> getCustomers() {
        return service.getCustomers();
    }

    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable int customerId) {
        return service.getCustomer(customerId);
    }

    @PostMapping("")
    public Customer saveCustomer(@RequestBody Customer customer) {
        customer.setId(0);
        service.saveOrUpdateCustomer(customer);
        return customer;
    }

    @PutMapping("")
    public Customer updateCustomer(@RequestBody Customer customer) {
        service.saveOrUpdateCustomer(customer);
        return customer;
    }

    @DeleteMapping("/{customerId}")
    public String deleteCustomer(@PathVariable int customerId) {
        service.deleteCustomer(customerId);
        return "Successfully Deleted";
    }
}
