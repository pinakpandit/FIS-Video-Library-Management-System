package com.example.movieservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movieservice.model.Movie;
import com.example.movieservice.repo.MovieRepository;


@Service
public class MovieServiceImpl implements MovieService {

	
	
	@Autowired
	MovieRepository repo;
	
	
	@Override
	public List<Movie> findAllMovies(){
		return repo.findAll();
	}
	
	@Override
	public Movie addMovie(Movie movie) {
		return repo.save(movie);
	}
	
	@Override
	public String deleteMovies(int mid) {
		repo.deleteById(mid);
		return "Movie deleted";
	}
	
	@Override
	public Movie updateMovie(Movie movie) {
		return repo.save(movie);
	}
	
	@Override
	public List<Movie> searchMoviesByMovieType(String movie_type){
		return repo.searchMoviesByMovieType(movie_type);
	}

//	@Override
//	public List<Movie> findAllMoviesByLeadActor(String lead_actor_name_1) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	
	
}
