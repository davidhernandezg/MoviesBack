package com.movies.domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;


public abstract class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4281036294127842362L;

	private Integer id;

	private String title;

	private String originalTitle;

	private Date releaseDate;

	private String genero;

	private Time duration;

	private Integer contentRating;

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

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Time getDuration() {
		return duration;
	}

	public void setDuration(Time duration) {
		this.duration = duration;
	}

	public Integer getContentRating() {
		return contentRating;
	}

	public void setContentRating(Integer contentRating) {
		this.contentRating = contentRating;
	}
}
