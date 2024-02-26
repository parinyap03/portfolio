package sqa.lap.data.stub;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

import sqa.lab9.api.MovieService;
import sqa.lab9.service.FavoriteMovie;

class FavoriteMovieMockito {

	@Test
	void testMockito() {
		MovieService movieser = mock(MovieService.class);
		HashMap<String, List<String>> allMovie  = new HashMap<String, List<String>>();
		List<String> actionList = Arrays.asList("The Batman.","Avatar : The Way Of Water.", "Black Panther : Wakanda Forever.");
		allMovie.put("action", actionList);
		when(movieser.allMoviePlayList("user")).thenReturn(allMovie);
		FavoriteMovie favmovies = new FavoriteMovie(movieser);
		List<String> listFavMovie = favmovies.getFavMovies("user", "action");
		assertNotNull(listFavMovie);
//		assertEquals(3, listFavMovie.size());
		
	}

}
