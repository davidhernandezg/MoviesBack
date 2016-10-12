package com.movies.adapter.dto;

import java.io.Serializable;

public class GenreDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2783825414236827864L;

	private Long id;
	
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
