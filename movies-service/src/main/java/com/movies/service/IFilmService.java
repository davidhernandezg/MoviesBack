package com.movies.service;

import com.movies.adapter.dto.FilmDTO;
import com.movies.domain.Film;

public interface IFilmService extends IGenericEntityService<Film, Long> {

	public void createFilm(FilmDTO filmDTO);
}
