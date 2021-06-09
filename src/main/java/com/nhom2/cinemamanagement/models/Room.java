package com.nhom2.cinemamanagement.models;

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
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "room_ID")
	private Integer roomID;
	
	@Column(name = "room_Name")
	private String roomname;
	
	@Column(name = "typeOfRoomID")
	private Integer typeOfRoomID;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "room_ID")
	private Set<Schedule> schedule = new HashSet<>();

	public Set<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(Set<Schedule> schedule) {
		this.schedule = schedule;
	}

	public Integer getRoomID() {
		return roomID;
	}

	public void setRoomID(Integer roomID) {
		this.roomID = roomID;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public Integer getTypeOfRoomID() {
		return typeOfRoomID;
	}

	public void setTypeOfRoomID(Integer typeOfRoomID) {
		this.typeOfRoomID = typeOfRoomID;
	}
	
}
