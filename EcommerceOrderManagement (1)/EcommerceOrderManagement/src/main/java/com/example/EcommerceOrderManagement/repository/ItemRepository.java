package com.example.EcommerceOrderManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EcommerceOrderManagement.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}