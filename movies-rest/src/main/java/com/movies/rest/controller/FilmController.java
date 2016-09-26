package com.movies.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movies.rest.domain.FilmDTO;
import com.movies.service.IFilmService;

import ma.glasnost.orika.MapperFacade;

@RestController
@RequestMapping("/api")
public class FilmController {

	@Inject
	private IFilmService filmService;
	
	@Inject
	private MapperFacade mapper;
	
	@RequestMapping(value="/getAll", method = RequestMethod.GET)
	@CrossOrigin
	public List<FilmDTO> getAll(){
		return mapper.mapAsList(filmService.findAll(), FilmDTO.class);
	}
	
	@RequestMapping(value="/byTitle/{title}")
	@CrossOrigin
	public List<FilmDTO> findByTitle(@PathVariable String title){
		return mapper.mapAsList(filmService.findByName(title), FilmDTO.class);
	}
}
