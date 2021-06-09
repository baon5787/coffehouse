package com.nhom2.cinemamanagement.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nhom2.cinemamanagement.models.Moviedetail;

public interface MoviesDetailRepostiopry extends JpaRepository<Moviedetail, Integer> {

	@Query("SELECT moviedetail FROM Moviedetail moviedetail WHERE moviedetail.movie_ID =:movie_ID")
	public List<Moviedetail> getByMovieID(@Param("movie_ID") Integer movie_ID);
}
