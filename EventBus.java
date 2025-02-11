class EventBus{
   Event movie;
   private int minutesWatched;

   public EventBus(Event movie, int minutesWatched){
    this.movie = movie;
    this.minutesWatched = minutesWatched;
   }
   public Event getMovie() { 
    return movie;
 }
   public int getMinutesWatched() { 
    return minutesWatched;
 }
}
    
