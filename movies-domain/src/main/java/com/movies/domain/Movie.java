package com.movies.domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4281036294127842362L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="title")
	private String title;

	@Column(name="original_title")
	private String originalTitle;

	@Column(name="release_date")
	private Date releaseDate;

	@Column(name="genre")
	private String genre;

	@Column(name="duration")
	private Time duration;

	@Column(name="content_rating")
	private Integer contentRating;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
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
