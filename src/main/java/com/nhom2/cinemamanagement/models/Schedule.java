package com.nhom2.cinemamanagement.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule implements Serializable{
	
	/**
	 * 
	 */
	 static final long serialVersionUID = -4886444859620407219L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "schedule_ID")
	private Integer id;
	
	@Column(name = "screening_ID")
	private Integer screeningId;
	
	//@Column(name = "movie_ID")
	private Integer movie_ID;
	
	//@Column(name = "room_ID")
	private Integer room_ID;
	
	@Column(name = "showdate")
	private Date showdate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name= "screening_ID")
	public Integer getScreeningId() {
		return screeningId;
	}
		
	@ManyToOne()
	@JoinColumn(name = "room_ID")
	public Integer getRoom_ID() {
		return room_ID;
	}
	
	@ManyToOne
	@JoinColumn(name = "movie_ID")
	public Integer getMovie_ID() {
		return movie_ID;
	}

	public void setMovie_ID(Integer movie_ID) {
		this.movie_ID = movie_ID;
	}

	public void setScreeningId(Integer screeningId) {
		this.screeningId = screeningId;
	}

	public Date getShowdate() {
		return showdate;
	}

	public void setRoom_ID(Integer room_ID) {
		this.room_ID = room_ID;
	}

	public void setShowdate(Date showdate) {
		this.showdate = showdate;
	}
	
}
