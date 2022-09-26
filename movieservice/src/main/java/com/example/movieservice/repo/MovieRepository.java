package com.example.movieservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.movieservice.model.Movie;

public interface MovieRepository extends JpaRepository <Movie,Integer> {

	@Query("select m from Movie m where m.movie_type=?1")
	public List<Movie> searchMoviesByMovieType(String movie_type);

	
	
	

	
}
