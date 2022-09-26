package com.example.customerservice.service;

import java.util.List;

import com.example.customerservice.model.Customer;
import com.example.customerservice.model.MovieDto;


public interface CustomerService {

	List<Customer> findAllCustomers();
	Customer addCustomer(Customer cust);
	Customer updateCustomer(Customer cust);
	String deleteCustomers(int cid);
//	List<MovieDto> searchMovieByMovieType(String movie_type);
	List<MovieDto> searchMoviesByMovieType(String movie_type);

}
