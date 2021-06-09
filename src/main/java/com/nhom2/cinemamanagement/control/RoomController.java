package com.nhom2.cinemamanagement.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.nhom2.cinemamanagement.control.services.ScheduleService;
import com.nhom2.cinemamanagement.models.Schedule;


@Controller
public class RoomController {
	
	@Autowired()
	private ScheduleService scheduleService;
	
	
}
