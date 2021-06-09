package com.nhom2.cinemamanagement.models;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movies {

	public Set<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(Set<Schedule> schedule) {
		this.schedule = schedule;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="movie_ID")
	private Integer id;
	
	@Column(name ="category_ID")
	private Integer categoryID;
	
	@Column(name ="movie_name")
	private String moviename;
	
	@Column(name ="movie_desciption")
	private String moviedesciption;
	
	@Column(name ="movie_length")
	private String movielength;
	
	@Column(name ="show_time")
	private Date showtime;
	
	private String image;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "movie_ID")
	private Set<Moviedetail> moviedetaill = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "movie_ID")
	private Set<Schedule> schedule = new HashSet<>();

	public Set<Moviedetail> getMoviedetaill() {
		return moviedetaill;
	}

	public void setMoviedetaill(Set<Moviedetail> moviedetaill) {
		this.moviedetaill = moviedetaill;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getMoviedesciption() {
		return moviedesciption;
	}

	public void setMoviedesciption(String moviedesciption) {
		this.moviedesciption = moviedesciption;
	}

	public String getMovielength() {
		return movielength;
	}

	public void setMovielength(String movielength) {
		this.movielength = movielength;
	}

	public Date getShowtime() {
		return showtime;
	}

	public void setShowtime(Date showtime) {
		this.showtime = showtime;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
