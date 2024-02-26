package sqa.lab9.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sqa.lab9.api.MovieService;

public class MoviePortal {
	private MovieService movieservice;
	private HashMap<String, List<String>> playListMovies;
	
	public MoviePortal(MovieService movieser) {
		this.movieservice = movieser;
	}
	
	//เอารีเทิร์นหนังท้ังหมด
	public HashMap<String, List<String>> getAllMovie(String user) {
		playListMovies = movieservice.allMoviePlayList(user);		
		return playListMovies;
	}

	
	
	


	
}
