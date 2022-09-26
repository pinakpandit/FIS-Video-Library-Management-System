package com.example.customerservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.customerservice.model.MovieDto;

@FeignClient(name="movieservice",url="http://MOVIESERVICE/movies")
public interface FeignProxy {

	@GetMapping("search/{movie_type}")
	public List<MovieDto> searchMoviesByMovieType(@PathVariable("movie_type") String movie_type);





}
