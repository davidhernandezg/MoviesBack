package com.movies.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.movies.service.IMovieServiceTest;
import com.movies.service.domain.Movie;

@Service
public class MovieServiceTestImpl implements IMovieServiceTest {

	private List<Movie> moviesList;

	public MovieServiceTestImpl() {
		this.moviesList = new ArrayList<Movie>();
	}

	public void createMovie() {
		Movie movie = new Movie();
		movie.setId(1);
		movie.setTitle("Los vengadores");
		movie.setGenero("Acción");

		moviesList.add(movie);
	}

	public List<Movie> getAllMovies() {
		return moviesList;
	}
}
