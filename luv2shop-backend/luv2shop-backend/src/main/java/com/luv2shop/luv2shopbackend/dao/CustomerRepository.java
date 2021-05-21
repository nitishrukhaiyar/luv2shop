package com.luv2shop.luv2shopbackend.dao;

import com.luv2shop.luv2shopbackend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
