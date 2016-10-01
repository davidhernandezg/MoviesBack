package com.movies.adapter.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.movies.adapter.dto.FilmDTO;
import com.movies.domain.Film;
import com.movies.service.IFilmService;

import ma.glasnost.orika.MapperFacade;

@Service
public class FilmAdapter {
	
	@Inject
	private IFilmService filmService;
	
	@Inject
	private MapperFacade mapper;
	
	public List<FilmDTO> findAll(){
		return mapper.mapAsList(filmService.findAll(),FilmDTO.class);
	}

	public FilmDTO findOne(Long id) {
		return mapper.map(filmService.findOne(id), FilmDTO.class);
	}
	
	public List<FilmDTO> findByTitle(String title) {
		return mapper.mapAsList(filmService.findByTitle(title),FilmDTO.class);
	}
	
	public void save(FilmDTO filmDTO) {
		Film film = mapper.map(filmDTO, Film.class);
		filmService.save(film);
	}

	public void delete(Long id) {
		filmService.delete(id);
	}
}
