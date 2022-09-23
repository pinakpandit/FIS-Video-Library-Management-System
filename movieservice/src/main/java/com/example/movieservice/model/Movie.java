package com.example.movieservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {
	@Id
	int mid;
	@Column
	String movie_name;
	@Column
	String release_year;
	@Column
	String language;
	@Column
	String rating;
	@Column
	String duration;
	@Column
	String movie_type;
	@Column
	String lead_actor_name_1;
	@Column
	String lead_actor_name_2;
	@Column
	String rental_cost;
	public Movie(){

}
	public Movie(int mid, String movie_name, String release_year, String language, String rating, String duration,
			String movie_type, String lead_actor_name_1, String lead_actor_name_2, String rental_cost) {
		super();
		this.mid = mid;
		this.movie_name = movie_name;
		this.release_year = release_year;
		this.language = language;
		this.rating = rating;
		this.duration = duration;
		this.movie_type = movie_type;
		this.lead_actor_name_1 = lead_actor_name_1;
		this.lead_actor_name_2 = lead_actor_name_2;
		this.rental_cost = rental_cost;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getRelease_year() {
		return release_year;
	}
	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getMovie_type() {
		return movie_type;
	}
	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}
	public String getLead_actor_name_1() {
		return lead_actor_name_1;
	}
	public void setLead_actor_name_1(String lead_actor_name_1) {
		this.lead_actor_name_1 = lead_actor_name_1;
	}
	public String getLead_actor_name_2() {
		return lead_actor_name_2;
	}
	public void setLead_actor_name_2(String lead_actor_name_2) {
		this.lead_actor_name_2 = lead_actor_name_2;
	}
	public String getRental_cost() {
		return rental_cost;
	}
	public void setRental_cost(String rental_cost) {
		this.rental_cost = rental_cost;
	}
	}
