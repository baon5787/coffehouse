package com.nhom2.cinemamanagement.control;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.nhom2.cinemamanagement.control.services.MoviesDetailService;
import com.nhom2.cinemamanagement.control.services.MoviesService;
import com.nhom2.cinemamanagement.models.Moviedetail;
import com.nhom2.cinemamanagement.models.Movies;

@Controller
public class WebController {

	@Autowired()
	private MoviesService moviesService;
	
	@Autowired()
	private MoviesDetailService moviesDetailService;

    @GetMapping("/")
    public String homePage(Model model){
    	List<Movies> allmoives = moviesService.GetMoivesAll();
    	model.addAttribute("allmoives", allmoives);
        return "index";
    }
    
    @GetMapping("/movie-page-left.html")
    public String loadmovies(Model model)
    {
    	return "movie-page-left.html";
    }
    
    @GetMapping("edit/{id}")
	public ModelAndView detailsmovies(@PathVariable(name="id")Integer id) {
		ModelAndView modelandview = new ModelAndView("movie-page-left");
		Movies movies = moviesService.get(id);
		List<Moviedetail> moviesdetail=moviesDetailService.getByMoviedetail(id);
		//System.out.println("moviesdetail : "+ moviesdetail);
		modelandview.addObject("moviesdetail", moviesdetail);
		//modelandview.addObject("moviedetail", moviedetail);
		modelandview.addObject(movies);
		return modelandview;
	}
}
