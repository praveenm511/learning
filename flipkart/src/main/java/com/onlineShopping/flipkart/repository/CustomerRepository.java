package com.onlineShopping.flipkart.repository;

import com.onlineShopping.flipkart.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers,Integer>,CustomerRepositoryCustom {
    public Customers findById(int id);
}

