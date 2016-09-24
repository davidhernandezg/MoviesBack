package com.movies.service;

import java.util.List;

import com.movies.service.domain.Movie;

public interface IMovieServiceTest {

	void createMovie();
	
	List<Movie> getAllMovies();
}
