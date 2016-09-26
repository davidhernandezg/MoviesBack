package com.movies.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.movies.domain.Film;
import com.movies.repository.FilmRepository;
import com.movies.service.IGenericEntityService;

@Service
public class FilmService implements IGenericEntityService<Film, Long>{
	
	@Inject
	FilmRepository filmRepository;

	@Override
	public List<Film> findAll() {
		return filmRepository.findAll();
	}

	@Override
	public void save(Film entity) {
		filmRepository.save(entity);
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
