package com.nhom2.cinemamanagement.daos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nhom2.cinemamanagement.models.Movies;

@Repository
public interface MoviesRepostiopry extends JpaRepository<Movies, Integer> {
	
	@Query("SELECT movies FROM Movies movies WHERE movies.moviename =:moviename")
	public Movies getByName(@Param("moviename") String moviename);
}
