package com.movies.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.movies.rest.domain.FilmDTO;
import com.movies.service.IMovieServiceTest;

@RestController
@RequestMapping("/test")
public class MovieTest {

	@Inject
	private IMovieServiceTest movieServiceTest;
	
	@RequestMapping(value="/movieTest")
	public void createMovie(){
		movieServiceTest.createMovie();
	}
	
	@RequestMapping(value="/getAll", method = RequestMethod.GET)
	@ResponseBody
	public List<FilmDTO> getAll(){
		List<FilmDTO> pija = new ArrayList<>();
		pija.add(new FilmDTO());
		pija.add(new FilmDTO());
		pija.add(new FilmDTO());
		pija.add(new FilmDTO());
		System.out.println();
//		List<MovieDTO>  algomas = mapper.mapAsList(movieServiceTest.getAllMovies(), MovieDTO.class);
		return pija;
		
	}
}
