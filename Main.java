import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static Map<String, List<Movie>> lab(ArrayList<Movie> movies) {

        // Drama Movies
        movies.add(new Movie("A Star is Born", "Drama", 136, true));
        movies.add(new Movie("Mid90s", "Drama", 85, true));
        movies.add(new Movie("Moonlight", "Drama", 125, true));
        movies.add(new Movie("The King’s Speech", "Drama", 119, false));

        // Action Movies
        movies.add(new Movie("The Amazing Spider-Man", "Action", 136, false));
        movies.add(new Movie("Mission Impossible: Fallout", "Action", 147, false));
        movies.add(new Movie("Jumanji: Welcome To The Jungle", "Action", 119, false));
        movies.add(new Movie("Avengers: Endgame", "Action", 181, false));

        // Animation Movies
        movies.add(new Movie("Cars", "Animation", 117, false));
        movies.add(new Movie("Toy Story", "Animation", 81, false));
        movies.add(new Movie("Inside Out", "Animation", 95, false));
        movies.add(new Movie("Frozen", "Animation", 109, false));

        // Thriller Movies
        movies.add(new Movie("Oldboy", "Thriller", 120, true));
        movies.add(new Movie("Parasite", "Thriller", 132, true));
        movies.add(new Movie("Taken", "Thriller", 90, false));
        movies.add(new Movie("Contagion", "Thriller", 106, false));

        // Horror Movies
        movies.add(new Movie("Triangle", "Horror", 99, true));
        movies.add(new Movie("The Invisible Man", "Horror", 124, true));
        movies.add(new Movie("Insidious", "Horror", 103, false));
        movies.add(new Movie("Sinister", "Horror", 110, false));

        // Sci-Fi Movies
        movies.add(new Movie("Sharknado", "Sci-Fi", 87, false));
        movies.add(new Movie("Ex Machina", "Sci-Fi", 110, true));
        movies.add(new Movie("Avatar", "Sci-Fi", 162, true));
        movies.add(new Movie("Interstellar", "Sci-Fi", 169, false));

        // Comedy Movies
        movies.add(new Movie("Rush Hour", "Comedy", 92, false));
        movies.add(new Movie("White Chicks", "Comedy", 115, false));
        movies.add(new Movie("22 Jump Street", "Comedy", 112, true));
        movies.add(new Movie("Jumanji: The Next Level", "Comedy", 123, false));

        // Print movies list
        System.out.println("------- Printing ArrayList of Movies ------");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // WARM UP
        // How would you create a map to associate a professor with their email?

        // Answer:
        // High Level: String -> String (could store as Double, etc. too)
        // Java: Map<String, String> profEmailMap = new HashMap<>();

        // Question:
        // How do you put these movies into a Map, mapping genres to Movies?
        // Take the next 10 minutes and create a HashMap and add the items in the list to the map.
        Map<String, List<Movie>> moviesByGenre = new HashMap<>();

        // 2 cases: Nothing or Something (list)

        // Nothing: movie genre G1 for movie m1 -> x
        // look up G1, get nothing back (no list)
        // create new list and add m1 to list
        // put new list [m1] back to map

        // Something: G1 -> [m1]
        // lookup movie genre G1 for movie m2
        // get [m1]
        // add m2 to [m1] -> [m1, m2]
        // put back list into map: G -> [m1, m2]
        // NOTE: map no longer refers to [m1], value is replaced by new list

        for (Movie movie : movies) {
            List<Movie> current = moviesByGenre.get(movie.getGenre());
            if (current == null) {  // check to see if that movie genre is already in your HashMap
                current = new ArrayList<Movie>(); // if not, then create a new empty list to add movies to
            }
            current.add(movie);  // add movie to list of movies associated with the genre
            moviesByGenre.put(movie.getGenre(), current);  // use the put() method to add to a HashMap
        }


        // Let's add some genres to our map without providing any associated movies
        moviesByGenre.put("Western", null);
        moviesByGenre.put("Mockumentary", null);

        // How do you work with the data in a HashMap?
        // Here we print out all the genres and their associated movies
        System.out.println("\n---------Printing out HashMap------");

        for(String key : moviesByGenre.keySet()){ //keySet = all the genres
            System.out.println("\nGENRE: " + key);
            List<Movie> movie_list = moviesByGenre.get(key);
            if (movie_list != null) {   // make sure list of movies for a genre is not empty
                for (Movie m : movie_list) {
                    System.out.println(m);
                }
            } else {
                System.out.println("No " + key + " movies =(");
            }
        }

        return moviesByGenre;
    }


    // Question 1a
    public static void printAverageLengthList(ArrayList<Movie> movies) {


    }

    // Question 1b
    public static void printAverageLengthMap(Map<String, List<Movie>> moviesByGenre) {


    }

    // Question 3
    public static Map<String, Double> getGenreRatingMap(ArrayList<Movie> movies) {

        return null;
    }

    // Question 4
    public static void filterNonFamilyFriendlyGenres(Map<String, Double> genreToRMap) {


    }

    // This "main" function will run the lab code
    // Make sure to UNCOMMENT the assignment functions to run them
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        Map<String, List<Movie>> moviesByGenre = Main.lab(movies);

        // ASSIGNMENT - uncomment to run function
        // printAverageLengthList(movies);
        // printAverageLengthMap(moviesByGenre);
        // genreToRMap = getGenreRatingMap(movies);
        // filterNonFamilyFriendlyGenres(genreToRMap);
        // NOTE: genreToRMap will now be family friendly (keys removed)
    }
}