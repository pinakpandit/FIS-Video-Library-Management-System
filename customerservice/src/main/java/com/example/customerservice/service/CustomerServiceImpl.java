package com.example.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerservice.model.Customer;
import com.example.customerservice.model.MovieDto;
import com.example.customerservice.repo.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
 CustomerRepository repo;
	
	@Autowired
	FeignProxy proxy;
	
	public List<Customer> findAllCustomers(){
		return repo.findAll();
	}
	@Override
	public Customer addCustomer(Customer cust) {
		return repo.save(cust);
	}
	
	@Override
	public String deleteCustomers(int cid) {
		repo.deleteById(cid);
		return "Customer deleted";
	}
	
	@Override
	public Customer updateCustomer(Customer cust) {
		return repo.save(cust);
	}
	
	@Override
	public List<MovieDto> searchMoviesByMovieType(String movie_type){
		return proxy.searchMoviesByMovieType(movie_type);
	}
	
	
	
}
