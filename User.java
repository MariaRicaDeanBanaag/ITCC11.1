import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User {
    String name;
    List<EventBus> watchHistory = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void watchMovie(Event movie, int minutesWatched) {
        EventBus record = new EventBus(movie, minutesWatched);
        watchHistory.add(record);
        System.out.println(name + " watched " + minutesWatched + " minutes of " + movie.getTitle());

    }

    public void recommendMovies(List<Event> movies) {
     
        Map<String, Integer> genreWatchTime = new HashMap<>();
        for (EventBus record : watchHistory) {
            genreWatchTime.put(record.movie.getGenre(), 
            genreWatchTime.getOrDefault(record.movie.getGenre(), 0) + record.getMinutesWatched());
    }
    

       
        String favoriteGenre = genreWatchTime.entrySet().stream()
        .max(Map.Entry.<String, Integer>comparingByValue()) 
        .map(entry -> entry.getKey()) 
        .orElse(null);
        if (favoriteGenre == null) {
            System.out.println("No recommendations available yet.");
            return;
        }

        System.out.println("Top genre: " + favoriteGenre);
        System.out.println("Recommended movies:");
        for (Event movie : movies) {
            if (movie.getGenre().equals(favoriteGenre) && 
                watchHistory.stream().noneMatch(e -> e.getMovie().equals(movie))) {
                System.out.println("- " + movie);
            }
        }
        }
    }
