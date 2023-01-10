package com.example.jpaExample.repository;

import com.example.jpaExample.model.Customer;
import com.example.jpaExample.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Customer findCustomerByCustomerId(int customerId);

    Set<OrderEntity> findOrdersByCustomerId(int customerId);

}
