package sqa.lap.data.stub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import sqa.lab9.api.MovieService;

public class MovieServiceStub implements MovieService {


	@Override
	public HashMap<String, List<String>> allMoviePlayList(String user) {
		HashMap<String, List<String>> playListMovies = new HashMap<String, List<String>>();
		List<String> actionList = Arrays.asList("The Batman.","Avatar : The Way Of Water.", "Black Panther : Wakanda Forever.");
		playListMovies.put("action",actionList);
		return playListMovies;
	}
	
	

}
