package reviews.movies;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {
	
	Map<Long,MovieReview> moviereviews = new HashMap<Long, MovieReview>();
	
	public ReviewRepository() {
		MovieReview BladeRunner = new MovieReview("Blade Runner","A blade runner must pursue and try to terminate four replicants who stole a ship in space and have returned to Earth to find their creator.", "1982","Ridley Scott","Sci-Fi",(long) 1684684,"BladeRunner.jpg");
		MovieReview HotFuzz = new MovieReview("Hot Fuzz","A skilled London police officer is transferred to a small town that's harbouring a dark secret.","2007","Edgar Wright","Comedy",(long) 2468544,"HotFuzz.jpg");
		MovieReview It = new MovieReview("It", "A group of bullied kids band together when a shapeshifting demon, taking the appearance of a clown, begins hunting children.", "2017", "Andy Muschietti", "Horror",(long) 4562518,"It.jpg");
		MovieReview DieHard = new MovieReview("Die Hard", "John McClane, officer of the NYPD, tries to save his wife Holly Gennaro and several others that were taken hostage by German terrorist Hans Gruber during a Christmas party at the Nakatomi Plaza in Los Angeles.", "1988", "John McTiernan", "Action", (long) 654813, "DieHard.jpg");
		MovieReview RomeoJuliet = new MovieReview("Romeo + Juliet", "Shakespeare's famous play is updated to the hip modern suburb of Verona still retaining its original dialogue.", "1996", "Baz Luhrmann", "Romance",(long) 5468188, "RomeoJuliet.jpg");
	}

	public Collection<MovieReview> findAll() {
		return moviereviews.values();
	}
	
	public MovieReview findOne(Long id) {
		return moviereviews.get(id);
	}


}