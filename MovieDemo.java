package assignment10;

class Movie {
 void play() {
     System.out.println("Playing a generic movie...");
 }
}

class RomComMovie extends Movie {
 void play() {
     System.out.println("Playing a Romantic Comedy movie with love and humor...");
 }
}

class ThrillerMovie extends Movie {
 void play() {
     System.out.println("Playing a Thriller movie with suspense and excitement...");
 }
}

class ActionMovie extends Movie {
 void play() {
     System.out.println("Playing an Action movie with fights and explosions...");
 }
}

public class MovieDemo {
 public static void main(String[] args) {
     Movie myMovie;
     myMovie = new RomComMovie();
     myMovie.play(); 
     myMovie = new ThrillerMovie();
     myMovie.play(); 
     myMovie = new ActionMovie();
     myMovie.play(); 
 }
}

