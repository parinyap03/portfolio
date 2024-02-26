package sqa.lap.data.stub;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;
import sqa.lab9.api.*;
import sqa.lab9.service.FavoriteMovie;
import sqa.lab9.service.MoviePortal;

class testMovieService_stub {
	

	@Test
	void test_getAllMovie_stub() {
		MovieService movieservice = new MovieServiceStub();
		MoviePortal moviepor = new MoviePortal(movieservice);
		HashMap<String, List<String>> movielist = moviepor.getAllMovie("user");
		assertNotNull(movielist);
	}
	@Test
	void test_favMovie_stub() {
		MovieService movieservice = new MovieServiceStub();
		HashMap<String, List<String>> allMovie = new HashMap<String, List<String>>();
		List<String> actionList = Arrays.asList("The Batman.","Avatar : The Way Of Water.", "Black Panther : Wakanda Forever.");
		List<String> datenightList = Arrays.asList("“The Notebook ", "50 First Dates", "A Walk to Remember", "First Love", "The Lucky");
		List<String> horrorList = Arrays.asList("The Conjuring (2013)","Evil Dead (2013)");
		allMovie.put("action", actionList);
		allMovie.put("datenight", datenightList);
		allMovie.put("horror", horrorList);
		FavoriteMovie favmovies = new FavoriteMovie(movieservice);
		List<String> listFavMovie = favmovies.getFavMovies("user", "action");
//		assertNotNull(listFavMovie);
		assertEquals(3, listFavMovie.size());
	}

}
