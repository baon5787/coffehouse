package com.nhom2.cinemamanagement.models;

import java.util.Date;
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
@Table(name = "screening")
public class Screening {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "screening_ID")
	private Integer id;
	
	@Column(name = "timeStart")
	private Date timestart;
	
	@Column(name = "timeEnd")
	private Date timeend;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "screening_ID")
	private Set<Schedule> schedule = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTimestart() {
		return timestart;
	}

	public void setTimestart(Date timestart) {
		this.timestart = timestart;
	}

	public Date getTimeend() {
		return timeend;
	}

	public void setTimeend(Date timeend) {
		this.timeend = timeend;
	}

	public Set<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(Set<Schedule> schedule) {
		this.schedule = schedule;
	}
}
