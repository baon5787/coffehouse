package com.nhom2.cinemamanagement.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class Moviedetaill implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6290505967233568580L;

	@Id
	private Integer movie_ID;
	
	@Id
	@Column(name="movie_image")
	private String image;
}
