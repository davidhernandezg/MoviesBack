package com.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.domain.Film;

public interface FilmRepository extends JpaRepository<Film, Long>{

}
