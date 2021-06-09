package com.nhom2.cinemamanagement.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nhom2.cinemamanagement.models.Room;

public interface RoomRepostiopry extends JpaRepository<Room, Integer>{

	@Query("SELECT room FROM Room room WHERE room.roomID =:roomID")
	public List<Room> getByRoomId(@Param("roomID") Integer roomID);
}
