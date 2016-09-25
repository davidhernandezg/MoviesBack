package com.movies.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movies.rest.domain.FilmDTO;
import com.movies.service.IMovieServiceTest;

import ma.glasnost.orika.MapperFacade;

@RestController
@RequestMapping("/test")
public class MovieTestController {

	@Inject
	private IMovieServiceTest movieServiceTest;
	
	@Inject
	private MapperFacade mapper;
	
	@RequestMapping(value="/create")
	public void createMovie(){
		movieServiceTest.createMovie();
	}
	
	@RequestMapping(value="/getAll", method = RequestMethod.GET)
	public List<FilmDTO> getAll(){
		return mapper.mapAsList(movieServiceTest.getAllMovies(), FilmDTO.class);
	}
}
