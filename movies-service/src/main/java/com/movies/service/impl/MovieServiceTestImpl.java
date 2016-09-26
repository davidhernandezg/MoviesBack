package com.movies.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.movies.domain.Film;
import com.movies.service.IMovieServiceTest;

@Service
public class MovieServiceTestImpl implements IMovieServiceTest {

	@Inject
	FilmServiceImpl filmService;
	
	public MovieServiceTestImpl() {
	}

	public void createMovie() {
		Film film = new Film();
		film.setTitle("Los vengadores");
		film.setGenre("Acción");
		filmService.save(film);
	}

	public void createMovie(String title) {
		Film film = new Film();
		film.setTitle(title);
		film.setGenre("Drama");

		filmService.save(film);
	}
	
	public List<Film> getAllMovies() {
		return filmService.findAll();
	}
	
	public List<Film> findByTitle(String title){
		return filmService.findByName(title);
	}
}
