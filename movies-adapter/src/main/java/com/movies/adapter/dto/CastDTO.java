package com.movies.adapter.dto;

import java.io.Serializable;

import com.movies.adapter.utilities.JobsEnum;

public class CastDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8474896566224038059L;

	/**
	 * Id
	 */
	private Long id;
	
	/**
	 * Nombre actor
	 */
	private String name;
	
	/**
	 * Nombre del personaje
	 */
	private String character;
	
	/**
	 * Enumerado (Actor/Director)
	 */
	private JobsEnum job;

	/**
	 * orden (importancia)
	 */
	private Integer order;

	/**
	 * Parte de la ruta dirección de la foto del actor.
	 */
	private String profilePath;

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

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public JobsEnum getJob() {
		return job;
	}

	public void setJob(JobsEnum job) {
		this.job = job;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getProfilePath() {
		return profilePath;
	}

	public void setProfilePath(String profilePath) {
		this.profilePath = profilePath;
	}
	
}
