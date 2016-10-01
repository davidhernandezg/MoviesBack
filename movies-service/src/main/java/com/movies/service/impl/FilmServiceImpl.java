package com.movies.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.movies.adapter.dto.FilmDTO;
import com.movies.domain.Film;
import com.movies.repository.FilmRepository;
import com.movies.service.IFilmService;

import ma.glasnost.orika.MapperFacade;

@Service
public class FilmServiceImpl implements IFilmService {
	
	@Inject
	FilmRepository filmRepository;

	@Inject
	private MapperFacade mapper;
	
	@Override
	public List<Film> findAll() {
		return filmRepository.findAll();
	}

	@Override
	public void createFilm(FilmDTO filmDTO) {
		Film film = mapper.map(filmDTO, Film.class);
		filmRepository.save(film);
	}
	
	public void save(Film film) {
		filmRepository.save(film);
	}

	@Override
	public Film findOne(Long id) {
		return filmRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		filmRepository.delete(id);
	}

	@Override
	public List<Film> findByName(String title) {
		return filmRepository.findByTitle(title);
	}

}
