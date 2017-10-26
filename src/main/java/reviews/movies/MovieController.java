package reviews.movies;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovieController {
	
	@Resource
	ReviewRepository MovieRepo = new ReviewRepository();

	@RequestMapping("/movie")
	public String showMovie(@RequestParam("id")Model model, Long id) {
		model.addAttribute("modelMovie", MovieRepo.findOne(id));
		return "movie-review";
	}
	@RequestMapping("/allMovies")
	public String showAll(Model model) {
		model.addAttribute("modelAllMovies", MovieRepo.findAll());
		return "movie-all-reviews";
	}
}
