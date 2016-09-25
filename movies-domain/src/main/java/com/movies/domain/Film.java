package com.movies.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="film")
public class Film extends Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4112103734832405837L;

}
