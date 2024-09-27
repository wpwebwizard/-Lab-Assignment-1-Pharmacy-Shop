public class Movie {
    private String title;
    private int ReleaseDate;
    private String Director;

    Movie(String title, int ReleaseDate, String Director) {
        setTitle(title);
        setReleaseDate(ReleaseDate);
        setDirector(Director);
    }

    Movie(String title, String Director) {
        this(title, 0, Director);
    }

    Movie(Movie movie){
        this(movie.title, movie.ReleaseDate, movie.Director);
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setReleaseDate(int ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
    }
    public int getReleaseDate() {
        return ReleaseDate;
    }
    public void setDirector(String Director) {
        this.Director = Director;
    }
    public String getDirector() {
        return Director;
    }

    public void displayInfo(){
        System.out.println("Title: " + title + "Release Date: " + ReleaseDate + "Director: " + Director);
    }
}
