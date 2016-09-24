package com.movies.rest.domain;

import java.io.Serializable;

public class MovieDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3173926033589557664L;

	private Integer id;
	
	private String title;
	
	private String genero;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
