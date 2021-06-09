package com.nhom2.cinemamanagement.control.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.cinemamanagement.daos.RoomRepostiopry;
import com.nhom2.cinemamanagement.daos.ScheduleRepostiopry;
import com.nhom2.cinemamanagement.models.Room;
import com.nhom2.cinemamanagement.models.Schedule;


@Service
@Transactional
public class ScheduleService{
	
	@Autowired
	private ScheduleRepostiopry repostiopry;
	
	@Autowired
	private RoomRepostiopry roomRepostiopry;
	
	private Schedule GetScreeningId(Integer ScreeningId){
		return repostiopry.getByScreeningId(ScreeningId);
	}
	
	private List<Schedule> GetMoviesId(Integer MoviesId)
	{
		return repostiopry.getByMoviesId(MoviesId);
	}
	
	private List<Room> GetAll(Integer roomID){
		return roomRepostiopry.getByRoomId(roomID);
	}
}
