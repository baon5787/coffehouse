package com.nhom2.cinemamanagement.control.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.MoviesRepostiopry;
import com.nhom2.cinemamanagement.models.Movies;

@Service
@Transactional
public class MoviesService {

	@Autowired
	private MoviesRepostiopry moviesRepostiopry;
	
	public List<Movies> GetMoivesAll()
	{
		return  moviesRepostiopry.findAll();
	}
	public Movies getByName(String moviesname)
	{
		return moviesRepostiopry.getByName(moviesname);
	}
	public Movies get(Integer id) {
		return moviesRepostiopry.findById(id).get();
	}
}
