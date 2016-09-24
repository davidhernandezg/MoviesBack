package com.movies.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.movies.rest.domain.MovieDTO;
import com.movies.service.IMovieServiceTest;

import ma.glasnost.orika.MapperFacade;

@RestController
@RequestMapping("/test")
public class MovieTest {

	@Inject
	private IMovieServiceTest movieServiceTest;
	
	@Inject
	private MapperFacade mapper;
	
	@RequestMapping(value="/movieTest")
	public void createMovie(){
		movieServiceTest.createMovie();
	}
	
	@RequestMapping(value="/getAll", method = RequestMethod.GET)
	@ResponseBody
	public List<MovieDTO> getAll(){
		List<MovieDTO> pija = new ArrayList<>();
		pija.add(new MovieDTO());
		pija.add(new MovieDTO());
		pija.add(new MovieDTO());
		pija.add(new MovieDTO());
		for(int i = 0;)
		System.out.println();
//		List<MovieDTO>  algomas = mapper.mapAsList(movieServiceTest.getAllMovies(), MovieDTO.class);
		return pija;
		
	}
}
