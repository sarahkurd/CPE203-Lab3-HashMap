public class Movie {

    private String name;
    private String genre;
    private int length;
    private Boolean R_rating;

    public Movie(String name, String genre, int length, Boolean R_rating) {
        this.name = name;
        this.genre = genre;
        this.length = length;
        this.R_rating = R_rating;
    }

    public String getMovie() {
        return this.name;
    }

    public Boolean familyFriendly() {
        return !this.R_rating;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getLength() {
        return this.length;
    }

    public String toString() {
        return String.format("Movie name: %30s\tGenre: %10s\tLength: %5d\tR-rated? %5s", this.name, this.genre, this.length, this.R_rating);
    }
}