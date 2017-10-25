package reviews.movies;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	@RequestMapping("/movie")
	public String showMovie(Model model) {
		Movie movie = new Movie("Blade Runner","A blade runner must pursue and try to terminate four replicants who stole a ship in space and have returned to Earth to find their creator.", "1982", "Ridley Scott");
		model.addAttribute("modelMovie", movie);
		return "movie-template";
	}
	@RequestMapping("/allMovies")
	public String showAll(Model model) {
		Movie movie = new Movie("Hot Fuzz","Hottest fuzz","2007","Edgar Wright");
		Movie movie2 = new Movie("Shawn of The Dead","zombies","2005","Edgar Wright");
		Movie movie3 = new Movie("At Worlds End","aliens","2009","Edgar Wright");
		Collection<Movie> movies=Arrays.asList(movie,movie2,movie3);
		
		model.addAttribute("modelAllMovies", movies);
		return "movie-all-template";
	}
}
