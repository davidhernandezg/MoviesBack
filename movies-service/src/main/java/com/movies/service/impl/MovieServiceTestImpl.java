package com.movies.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.movies.domain.Cast;
import com.movies.domain.Film;
import com.movies.domain.Genre;
import com.movies.domain.JobsEnumDomain;
import com.movies.service.IMovieServiceTest;

@Service
public class MovieServiceTestImpl implements IMovieServiceTest {

	@Inject
	FilmServiceImpl filmService;

	public MovieServiceTestImpl() {
	}

	public void createMovie() {
		Film film = new Film();

		List<Cast> castList = new ArrayList<>();
		Cast cast = new Cast();
//		cast.setId(1L);
		cast.setName("chris evans");
		cast.setOrder(0);
		cast.setCharacter("capt");
//		cast.setJob(JobsEnumDomain.ACTOR);
		castList.add(cast);

		cast = new Cast();
//		cast.setId(2L);
		cast.setName("Robert Downey Jr.");
		cast.setOrder(1);
		cast.setCharacter("iron man");
//		cast.setJob(JobsEnumDomain.ACTOR);
		castList.add(cast);

		List<Genre> genreList = new ArrayList<>();
		Genre genre = new Genre();
		genre.setName("Accion");
		genreList.add(genre);

		genre = new Genre();
		genre.setName("Drama");
		genreList.add(genre);
		
		film.setTitle("Los vengadores");
		film.setCast(castList);
		film.setGenre(genreList);
		filmService.save(film);
	}

	// public void createMovie(String title) {
	// Film film = new Film();
	// film.setTitle(title);
	// film.setGenre("Drama");
	//
	// filmService.save(film);
	// }

	public List<Film> getAllMovies() {
		return filmService.findAll();
	}

	public List<Film> findByTitle(String title) {
		return filmService.findByTitle(title);
	}
}
