package com.nhom2.cinemamanagement.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(Moviedetaill.class)
@Table(name="moviedetail")
public class Moviedetail{
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 6535468843719759751L;

	@Id
	private Integer movie_ID;
	
	@Id
	@Column(name="movie_image")
	private String image;

	@ManyToOne()
	@JoinColumn(name = "movie_ID")
	public Integer getMovie_ID() {
		return movie_ID;
	}

	public void setMovie_ID(Integer movie_ID) {
		this.movie_ID = movie_ID;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	
}
