import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Event> movies = Arrays.asList(
                new Event("Marvels", "Sci-Fi", 145),
                new Event("Guardiams of the Galaxy", "Sci-Fi", 122),
                new Event("Infinity War", "Sci-Fi", 229),
                new Event("A Walk to Remember", "Romance", 142),
                new Event("The Notebook", "Romance", 201),
                new Event("To All the Boys I Have Loved Before", "Romance", 400),
                new Event("Captain America: The Winter Soldier", "Action", 216),
                new Event("Fall Guy", "Action", 206),
                new Event("John Wick", "Action", 141)
        );

        User user = new User("Maria");
        user.watchMovie(movies.get(6), 148); 
        user.watchMovie(movies.get(7), 100); 
        user.watchMovie(movies.get(5), 195); 

        user.recommendMovies(movies);
    }
}
