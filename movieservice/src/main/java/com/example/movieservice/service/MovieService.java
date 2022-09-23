package com.example.movieservice.service;

import java.util.List;

import com.example.movieservice.model.Movie;

public interface MovieService {

	List<Movie> findAllMovies();

	Movie addMovie(Movie movie);

	String deleteMovies(int mid);

	Movie updateMovie(Movie movie);

//	List<Movie> findAllMoviesByMovieType(String movie_type);
//
//	List<Movie> findAllMoviesByLeadActor(String lead_actor_name_1);

	List<Movie> searchMoviesByMovieType(String movie_type);

}
