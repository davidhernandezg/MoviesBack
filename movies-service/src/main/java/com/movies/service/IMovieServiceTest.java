package com.movies.service;

import java.util.List;

import com.movies.domain.Film;

public interface IMovieServiceTest {

//	void createMovie();
//	void createMovie(String title);
	List<Film> getAllMovies();
	List<Film> findByTitle(String title);
}
