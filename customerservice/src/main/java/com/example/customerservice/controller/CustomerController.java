package com.example.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerservice.model.Customer;
import com.example.customerservice.model.MovieDto;
import com.example.customerservice.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer cust) {
		return service.addCustomer(cust);
	}
	
	@GetMapping("/all")
	public List<Customer> getAll(){
		return service.findAllCustomers();
	}
	
	@PostMapping("/update")
	public Customer updateCustomer(@RequestBody Customer cust) {
		return service.updateCustomer(cust);
	}
	
	@DeleteMapping("/delete/{cid}")
	public String deleteCustomers(@PathVariable("cid") int cid) {
		return service.deleteCustomers(cid);
		
	}
	
	@GetMapping("/search/{movie_type}")
	public List<MovieDto> searchMoviesByMovieType(@PathVariable("movie_type")String movie_type){
		return service.searchMoviesByMovieType(movie_type);
	}
			

}
