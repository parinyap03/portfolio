package sqa.lab9.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sqa.lab9.api.MovieService;

public class FavoriteMovie  {
	private MovieService movieservice;

	public FavoriteMovie(MovieService movieser) {
		this.movieservice = movieser;
	}

	
	//รีเทิร์นค่าที่ตรงกับชื่อเพลลิสต์ที่ส่งมา
	public List<String> getFavMovies(String user,String type){
		List<String> movies = null;
		MoviePortal moviePortal = new MoviePortal(movieservice);
		HashMap<String, List<String>> playListMovies = moviePortal.getAllMovie(user);
		for(String i : playListMovies.keySet()) {
			movies = playListMovies.get(i);
		}
		return movies;
	}

}
