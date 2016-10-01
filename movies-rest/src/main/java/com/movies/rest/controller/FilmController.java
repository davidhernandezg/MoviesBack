package com.movies.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movies.adapter.dto.FilmDTO;
import com.movies.adapter.service.FilmAdapter;


@RestController
@RequestMapping("/api/film")
public class FilmController {

	@Inject
	FilmAdapter adapter;
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public List<FilmDTO> getAll(){
		return adapter.findAll();
	}
	
	@CrossOrigin
	@RequestMapping(value="/{id}")
	public FilmDTO findOne(@PathVariable Long id){
		return adapter.findOne(id);
	}
	
	@CrossOrigin
	@RequestMapping(value="/title/{title}")
	public List<FilmDTO> findByTitle(@PathVariable String title){
		return adapter.findByTitle(title);
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody FilmDTO filmDTO) {
		adapter.save(filmDTO);
	}
	
	@CrossOrigin
	@RequestMapping(method= RequestMethod.PUT)
	public void update(@RequestBody FilmDTO filmDTO){
		adapter.save(filmDTO);
	}
	
	@CrossOrigin
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void delete (@PathVariable Long id){
		adapter.delete(id);
	}
	
}
