package com.movies.service.externalimport.model;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class FilmApi {
	private boolean adult;
	@JsonProperty(value="backdrop_path")
	private String backdropPath;
	@JsonProperty(value="genre_ids")
	private List<Integer> genresIds;
	@JsonProperty(value="id")
	private Long idTmdb;
	@JsonProperty(value="original_language")
	private String originalLanguage;
	@JsonProperty(value="original_title")
	private String originalTitle;
	private String overview;
	@JsonProperty(value="release_date")
	private Date releaseDate;
	@JsonProperty(value="poster_path")
	private String posterPath;
	private Double popularity;
	private String title;
	private boolean video;
	@JsonProperty(value="vote_average")
	private	Double voteAverage;
	@JsonProperty(value="vote_count")
	private Integer voteCount;
	
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public String getBackdropPath() {
		return backdropPath;
	}
	public void setBackdropPath(String backdropPath) {
		this.backdropPath = backdropPath;
	}
	public List<Integer> getGenresIds() {
		return genresIds;
	}
	public void setGenresIds(List<Integer> genresIds) {
		this.genresIds = genresIds;
	}
	public Long getIdTmdb() {
		return idTmdb;
	}
	public void setIdTmdb(Long idTmdb) {
		this.idTmdb = idTmdb;
	}
	public String getOriginalLanguage() {
		return originalLanguage;
	}
	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}
	public String getOriginalTitle() {
		return originalTitle;
	}
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public Double getPopularity() {
		return popularity;
	}
	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isVideo() {
		return video;
	}
	public void setVideo(boolean video) {
		this.video = video;
	}
	public Double getVoteAverage() {
		return voteAverage;
	}
	public void setVoteAverage(Double voteAverage) {
		this.voteAverage = voteAverage;
	}
	public Integer getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}
}