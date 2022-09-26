package com.example.customerservice.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customerservice.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	
	
	

}
