package com.nhom2.cinemamanagement.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nhom2.cinemamanagement.models.Schedule;

@Repository
public interface ScheduleRepostiopry extends JpaRepository<Schedule, Integer> {
	
	@Query("SELECT schedule FROM Schedule schedule WHERE schedule.screeningId =:screeningId")
	public Schedule getByScreeningId(@Param("screeningId") Integer screeningId);
	
	@Query("SELECT schedule FROM Schedule schedule WHERE schedule.movieId =:movieId")
	public List<Schedule> getByMoviesId(@Param("movieId") Integer movieId);

}
