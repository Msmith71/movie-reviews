package reviews.movies;


public class MovieReview {
	
	String name;
	private String description;
	private String year;
	private String director;
	private String genre;
	Long id;
	private String imageUrl;
	
	
	
	
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
	
	public String getGenre() {
		return genre;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public MovieReview(String name, String description, String year, String director, String genre, Long id, String imageUrl) {
		this.name = name;
		this.description = description;
		this.year = year;
		this.director = director;
		this.genre = genre;
		this.id = id;
		this.imageUrl = imageUrl;
	}
	
	
	


}
