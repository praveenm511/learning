package com.onlineShopping.flipkart.service.implementation;

import com.onlineShopping.flipkart.model.Customers;
import com.onlineShopping.flipkart.repository.CustomerRepository;
import com.onlineShopping.flipkart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customers getCustomerById(int id) {
        return customerRepository.getReferenceById(id);
    }
}
