package com.example.EcommerceOrderManagement.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EcommerceOrderManagement.Order;

@Repository
public interface CustomerOrderRepository extends JpaRepository<Order, Long>{
	List<Order> findByCustomerId(long customerId);
}
