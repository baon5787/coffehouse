package com.nhom2.cinemamanagement.control.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.MoviesDetailRepostiopry;
import com.nhom2.cinemamanagement.models.Moviedetail;

@Service
@Transactional
public class MoviesDetailService {

	@Autowired
	private MoviesDetailRepostiopry moviesDetailRepostiopry;
	
	public List<Moviedetail> getByMoviedetail(Integer movie_ID)
	{
		return moviesDetailRepostiopry.getByMovieID(movie_ID);
	}
}
