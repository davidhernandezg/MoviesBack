package com.movies.service.externalimport.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class MoviesByGenre {
	private Long id;
	private Integer page;
	private List<FilmApi> results;
	@JsonProperty(value="total_pages")
	private Integer totalPages;
	@JsonProperty(value="total_results")
	private Integer totalResults;
	
	
	public MoviesByGenre() {
	}
	
	public Long getId() {
		return id;
	}
	public List<FilmApi> getResults() {
		return results;
	}

	public void setResults(List<FilmApi> results) {
		this.results = results;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Integer getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}
}
