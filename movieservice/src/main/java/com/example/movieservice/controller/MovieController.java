package com.example.movieservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieservice.model.Movie;
import com.example.movieservice.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
@Autowired
MovieService service;
	
@GetMapping("/all")
public ResponseEntity<List<Movie>> getAll(){
	return new ResponseEntity<>(service.findAllMovies(),HttpStatus.OK);
}

@PostMapping("/add")
public Movie addMovie(@RequestBody Movie movie) {
	return service.addMovie(movie);
}

@DeleteMapping("/delete/{mid}")
public String deleteMovies(@PathVariable("mid") int mid) {
	return service.deleteMovies(mid);
}


@PostMapping("/update")
public Movie updateMovie(@RequestBody Movie movie) {
	return service.addMovie(movie);
}

@GetMapping("/search/{movie_type}")
public ResponseEntity< List<Movie>> searchMoviesByMovieType(@PathVariable("movie_type")String movie_type){
	return new ResponseEntity<>(service.searchMoviesByMovieType(movie_type),HttpStatus.OK);

}
	
	
}
