package com.movies.adapter.dto;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class FilmDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3173926033589557664L;

	/**
	 * Identificador del vídeo
	 */
	private Long id;

	/**
	 * Título España
	 */
	private String title;

	/**
	 * Titulo Original
	 */
	private String originalTitle;

	/**
	 * Fecha de estreno
	 */
	private Date releaseDate;

	/**
	 * Género
	 */
	private List<GenreDTO> genre;

	/**
	 * Duración del vídeo
	 */
	private LocalTime duration;

	/**
	 * Calificación del contenido
	 */
	private Float popularity;

	/**
	 * Presupuesto
	 */
	private Long budget;

	/**
	 * Id en imdb para los enlaces a su web de la película
	 */
	private Long imdbId;

	/**
	 * Descripción en español de la película.
	 */
	private String overview;

	/**
	 * Lema
	 */
	private String tagline;

	/**
	 * Ingresos
	 */
	private Long revenue;

	/**
	 * ULR imagen película
	 */
	private String poster;

	/**
	 * Duración de la película en min.
	 */
	private Integer runtime;

	/**
	 * Lista de actores/director
	 */
	private List<CastDTO> cast;
	
	/**
	 * Key video youtube
	 */
	private String video;

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

	public List<GenreDTO> getGenre() {
		return genre;
	}

	public void setGenre(List<GenreDTO> genre) {
		this.genre = genre;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	public Float getPopularity() {
		return popularity;
	}

	public void setPopularity(Float popularity) {
		this.popularity = popularity;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public Long getImdbId() {
		return imdbId;
	}

	public void setImdbId(Long imdbId) {
		this.imdbId = imdbId;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public Long getRevenue() {
		return revenue;
	}

	public void setRevenue(Long revenue) {
		this.revenue = revenue;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public Integer getRuntime() {
		return runtime;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	public List<CastDTO> getCast() {
		return cast;
	}

	public void setCast(List<CastDTO> cast) {
		this.cast = cast;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}
}
