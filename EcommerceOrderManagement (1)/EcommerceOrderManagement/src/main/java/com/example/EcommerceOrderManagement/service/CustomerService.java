package com.example.EcommerceOrderManagement.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcommerceOrderManagement.Customer;
import com.example.EcommerceOrderManagement.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerrepository;
	public Customer saveCustomer(Customer customer) {
		return customerrepository.save(customer);
	}
	public List<Customer> getAllCustomers() {
        return customerrepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerrepository.findById(id).orElse(null);
    }

    public void deleteCustomer(Long id) {
        customerrepository.deleteById(id);
    }

}