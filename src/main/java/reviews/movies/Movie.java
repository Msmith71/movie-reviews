package reviews.movies;

public class Movie {
	
	private String name;
	private String description;
	private String year;
	private String director;
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public String getYear() {
		return year;
	}
	
	public String getDirector() {
		return director;
	}
	
	public Movie(String name, String description, String year, String director) {
		this.name = name;
		this.description = description;
		this.year = year;
		this.director = director;
	}
	
	
	


}
